package sample;

public class MouseController {

    private static MouseController instance = null;

    public static MouseController getInstance() {
        if(instance == null) {
            instance = new MouseController();
        }
        return instance;
    }

    int x;
    int y;

    public void getCoords(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Coord {" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
