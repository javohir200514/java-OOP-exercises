package oops2.time;

public class Time {
    private int hour;
    private int minute;
    private int second;
    public Time(int minute,int hour,int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour,int minute,int second){
        this.second=second;
        this.minute=minute;
        this.hour=hour;
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }

    public Time nextSecond(){
        if(second<58){
            this.second=second++;
        }
        return this ;
    }
}
