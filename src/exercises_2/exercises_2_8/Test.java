package exercises_2.exercises_2_8;

public class Test {
    public static void main(String[] args) {
        // 1. Standart konstruktor bilan obyekt yaratish
        MyCircle circle1 = new MyCircle();
        System.out.println("circle1: " + circle1);

        // 2. Koordinatalar va radius orqali obyekt yaratish
        MyCircle circle2 = new MyCircle(3, 4, 5);
        System.out.println("circle2: " + circle2);

        // 3. MyPoint obyekti orqali obyekt yaratish
        MyPoint centerPoint = new MyPoint(6, 8);
        MyCircle circle3 = new MyCircle(centerPoint, 10);
        System.out.println("circle3: " + circle3);

        // 4. Radiusni olish va o‘zgartirish
        System.out.println("circle2 radius: " + circle2.getRadius());
        circle2.setRadius(7);
        System.out.println("circle2 yangi radius: " + circle2.getRadius());

        // 5. Markazni olish va o‘zgartirish
        System.out.println("circle3 markazi: " + circle3.getCenter());
        circle3.setCenter(new MyPoint(2, 2));
        System.out.println("circle3 yangi markazi: " + circle3.getCenter());

        // 6. Maydon va perimetr (circumference) ni hisoblash
        System.out.println("circle2 maydoni: " + circle2.getArea());
        System.out.println("circle2 perimetri: " + circle2.getCircumference());

        // 7. Ikki doiraning markazlari orasidagi masofani hisoblash
        double distance = circle1.distance(circle2);
        System.out.println("circle1 va circle2 orasidagi masofa: " + distance);
    }
}
