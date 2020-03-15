package sample;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

import javax.swing.*;
import javax.xml.soap.Text;
import java.time.LocalTime;

public class Controller {

    private static AddTime addTime = AddTime.getInstance();
    private static MouseController mouseController = MouseController.getInstance();

    @FXML
    Label currentTime;
    @FXML
    Label timeToSend;
    @FXML
    TextField hourToSend;
    @FXML
    TextField minuteToSend;
    @FXML
    TextField secondToSend;
    @FXML
    TextField msToSend;
    @FXML
    Label coords;

    public void initialize() {
    Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
        LocalTime time = LocalTime.now();
        int godziny = time.getHour();
        int minuty = time.getMinute();
        int sekundy = time.getSecond();
        int milisekundy = time.getNano()/1000000;

        currentTime.setText(godziny + ":" + minuty + ":" + sekundy + ":" + milisekundy);
    }),
            new KeyFrame(Duration.millis(1))
    );
        clock.setCycleCount(Animation.INDEFINITE);
        clock.play();
    }

    public void currentTime() {
        initialize();
    }

    public void clickToAddTime() {
        int hour = Integer.parseInt(hourToSend.getText());
        int minute = Integer.parseInt(minuteToSend.getText());
        int second = Integer.parseInt(secondToSend.getText());
        int ms = Integer.parseInt(msToSend.getText());
        addTime.AddTime(hour, minute, second, ms);

        timeToSend.setText(addTime.toString());
    }

    public void buttonPlay() {


    }

    public void mousePosition(MouseEvent e) {
        int x = (int)e.getSceneX();
        int y = (int)e.getSceneY();

        mouseController.getCoords(x,y);
        coords.setText(mouseController.toString());
    }

    public void buttonAddCoord() {


    }

    public void handleButtonAction() {



    }
}
