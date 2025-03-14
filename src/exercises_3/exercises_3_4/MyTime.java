package exercises_3.exercises_3_4;

import exercises_1.time.Time;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime(){
        this.hour=0;
        this.minute=0;
        this.second=0;
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
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

    public void setTime(int hour, int minute, int second) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    @Override
    public String toString() {
        return
                "[" + hour +
                        ":" + minute +
                        ":" + second+"]";
    }

    public MyTime nextSecond() {
        if (second <= 58) {
            this.second++;
        } else {
            this.second = 0;
            if (minute <= 58) {
                this.minute++;
            } else {
                this.minute = 0;
                if (hour == 23) {
                    this.hour = 0;
                } else {
                    this.hour++;
                }

            }
        }
        return this;
    }

    public MyTime nextMinute() {
        if (minute <= 58) {
            this.minute++;
        } else {
            this.minute = 0;
            if(hour<24) {
                this.hour++;
            }else{
                this.hour=0;
            }
        }
        return this;
    }

    public MyTime nextHour() {
        if (hour < 24) {
            this.hour++;
        } else {
            this.hour=0;
        }
        return this;
    }

    public MyTime previousSecond() {
        if (second > 0) {
            second--;
        } else {
            second = 59;
            if (minute > 0) {
                minute--;
            } else {
                minute = 59;
                if (hour == 0) {
                    hour = 23;
                } else {
                    hour--;
                }

            }
        }
        return this;
    }

    public MyTime previousMinute() {
        if (minute > 0) {
            minute--;
        } else {
            minute = 59;
            if (hour > 0) {
                hour--;
            } else {
                hour = 23;
            }
        }
        return this;
    }

    public MyTime previousHour() {
        if (hour > 0) {
            hour--;
        } else {
            hour=23;
        }
        return this;
    }
}
