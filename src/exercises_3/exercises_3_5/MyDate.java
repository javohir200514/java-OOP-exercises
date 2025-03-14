package exercises_3.exercises_3_5;

import java.util.Arrays;

public class MyDate {
    private int year;
    private int month;
    private int day;
    private int totolDay=0;

    public String[] months={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
    public String[] days={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    public int[] daysInMonths={31,28,31,30,31,30,31,31,30,31,30,31};

    public boolean isLeapYear(int year){
        if(year%4==0&&year%100!=0||year%400==0){
            return true;
        }
        return false;
    }

    public int getTotolDay(){
        for (int i = 0; i < month; i++) {
            totolDay+=daysInMonths[i];
        }
        return totolDay;
    }

    public boolean isValidDate(int year,int month,int day){
        if(year>=1&&year<10000&&month>0&&month<=12){
            if (month == 2 && isLeapYear(year)) {
                daysInMonths[1] = 29;
            }
            if(daysInMonths[month-1]>=day){
                return true;
            }
        }

        return false;
    }

    public MyDate(int year, int month, int day) {
            this.year = year;
            this.month = month;
            this.day = day;
    }

    public void setDate(int year,int month,int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public MyDate nextDay(){
        if(day<daysInMonths[month-1]){
            totolDay++;
            day++;
        }else{
            totolDay++;
            day=1;
            if(month<12){
                month++;
            }else{
                month=1;
                year++;
            }
        }
        return this;
    }

    public MyDate nextMonth(){
        if(month<12){
            month++;
            totolDay+=daysInMonths[month-1];
        }else{
            month=1;
            totolDay+=daysInMonths[month-1];
            year++;
        }
        return this;
    }
    public MyDate previousDay(){
        if(day>1){
            day--;
        }else{
            day=daysInMonths[month-2];
            if(month>1){
                month--;
            }else{
                month=12;
                year--;
            }
        }
        return this;
    }

    public MyDate nextYear(){
        year++;
        if(isLeapYear(year)){
            totolDay+=366;
        }else{
            totolDay+=365;
        }
        return this;
    }

    public MyDate previousMonth(){
        if(month>1){
            month--;
        }else{
            month=12;
            year--;
        }
        return this;
    }

    public MyDate previousYear(){
        year--;
        return this;
    }

    @Override
    public String toString() {
        if(isValidDate(year,month,day)){
        return "["+days[getTotolDay()%7] +
                " " + day +
                " " + months[month-1] +
                " " + year +
                ']';
        }else{
            return "Error";
        }
    }

}
