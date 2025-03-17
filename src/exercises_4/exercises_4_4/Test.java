package exercises_4.exercises_4_4;

public class Test {
    public static void main(String[] args) {
        // Point sinfi uchun test
        Point p = new Point(2.5f, 3.5f);
        System.out.println("Point boshlang'ich: " + p);

        p.setX(5.0f);
        p.setY(6.0f);
        System.out.println("Point yangilangan: " + p);

        float[] xy = p.getXY();
        System.out.println("getXY(): [" + xy[0] + ", " + xy[1] + "]");

        // MovablePoint sinfi uchun test
        MovablePoint mp = new MovablePoint(2.0f, 3.0f, 1.5f, 2.5f);
        System.out.println("MovablePoint boshlang'ich: " + mp);

        mp.move();
        System.out.println("MovablePoint harakatdan keyin: " + mp);

        mp.setSpeed(3.0f, 4.0f);
        System.out.println("MovablePoint yangi tezlik: " + mp);

        float[] speed = mp.getSpeed();
        System.out.println("getSpeed(): [" + speed[0] + ", " + speed[1] + "]");

        mp.move();
        System.out.println("MovablePoint yana harakatdan keyin: " + mp);
    }
}
