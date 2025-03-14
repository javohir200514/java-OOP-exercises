package exercises_2.exercises_2_7;

public class Test {
    public static void main(String[] args) {
        // MyPoint sinfidan foydalanib obyektlar yaratamiz
        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(4, 6);

        // MyLine obyektini yaratamiz
        MyLine line = new MyLine(p1, p2);

        // toString metodini tekshirish
        System.out.println(line);

        // getBegin va getEnd metodlarini tekshirish
        System.out.println("Begin point: " + line.getBegin());
        System.out.println("End point: " + line.getEnd());

        // getBeginX, getBeginY, getEndX, getEndY metodlarini tekshirish
        System.out.println("Begin X: " + line.getBeginX());
        System.out.println("Begin Y: " + line.getBeginY());
        System.out.println("End X: " + line.getEndX());
        System.out.println("End Y: " + line.getEndY());

        // setBegin va setEnd metodlarini tekshirish
        line.setBegin(new MyPoint(2, 3));
        line.setEnd(new MyPoint(5, 7));
        System.out.println("After modifying:");
        System.out.println(line);

        // setBeginX, setBeginY, setEndX, setEndY metodlarini tekshirish
        line.setBeginX(3);
        line.setBeginY(4);
        line.setEndX(6);
        line.setEndY(8);
        System.out.println("After modifying coordinates:");
        System.out.println(line);

        // setBeginXY va setEndXY metodlarini tekshirish
        line.setBeginXY(0, 0);
        line.setEndXY(3, 4);
        System.out.println("After setting new coordinates:");
        System.out.println(line);
        System.out.println("New length: " + line.getLength());
    }
}
