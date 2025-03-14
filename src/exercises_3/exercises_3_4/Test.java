package exercises_3.exercises_3_4;

public class Test {
    public static void main(String[] args) {
        // Default konstruktorni sinash
        MyTime time1 = new MyTime();
        System.out.println("Default time: " + time1.toString());

        // Parametrli konstruktorni sinash
        MyTime time2 = new MyTime(23, 59, 59);
        System.out.println("Initialized time: " + time2.toString());

        // Getter metodlarini sinash
        System.out.println("Hour: " + time2.getHour());
        System.out.println("Minute: " + time2.getMinute());
        System.out.println("Second: " + time2.getSecond());

        // Setter metodlarini sinash
        time2.setHour(12);
        time2.setMinute(30);
        time2.setSecond(45);
        System.out.println("Updated time: " + time2.toString());

        // nextSecond() metodini sinash
        MyTime nextSecTime = time2.nextSecond();
        System.out.println("After nextSecond(): " + nextSecTime.toString());

        // nextMinute() metodini sinash
        MyTime nextMinTime = time2.nextMinute();
        System.out.println("After nextMinute(): " + nextMinTime.toString());

        // nextHour() metodini sinash
        MyTime nextHourTime = time2.nextHour();
        System.out.println("After nextHour(): " + nextHourTime.toString());

        // previousSecond() metodini sinash
        MyTime prevSecTime = time2.previousSecond();
        System.out.println("After previousSecond(): " + prevSecTime.toString());

        // previousMinute() metodini sinash
        MyTime prevMinTime = time2.previousMinute();
        System.out.println("After previousMinute(): " + prevMinTime.toString());

        // previousHour() metodini sinash
        MyTime prevHourTime = time2.previousHour();
        System.out.println("After previousHour(): " + prevHourTime.toString());
    }
}
