package sample;

public class AddTime {
    int hour;
    int minute;
    int second;
    int ms;

    private static AddTime instance = null;

    public static AddTime getInstance() {
        if (instance == null) {
            instance = new AddTime();
        }
        return instance;
    }

    public void AddTime(int hour, int minute, int second, int ms) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.ms = ms;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getMs() {
        return ms;
    }

    public void setMs(int ms) {
        this.ms = ms;
    }

    @Override
    public String toString() {
        return hour + ":" + minute + ":" + second + ":" + ms;
    }
}


