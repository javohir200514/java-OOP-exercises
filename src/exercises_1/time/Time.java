package exercises_1.time;

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
        return
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second;
    }

    public Time nextSecond(){
        if(second<=58){
            second++;
        }else{
            second=0;
            if(minute<=58){
                minute++;
            }else{
                minute=0;
                if(hour==23){
                    hour=0;
                }else{
                    hour++;
                }

            }
        }
        return this ;
    }
    public Time previousSecond(){
        if(second>0){
            second--;
        }else{
            second=59;
            if(minute>0){
                minute--;
            }else{
                minute=59;
                if(hour==0){
                    hour=23;
                }else{
                    hour--;
                }

            }
        }
        return this ;
    }
}
