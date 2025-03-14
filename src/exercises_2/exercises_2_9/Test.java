package exercises_2.exercises_2_9;

public class Test {
    public static void main(String[] args) {
        // 1. Uchburchakni koordinatalar orqali yaratish
        MyTriangle triangle1 = new MyTriangle(0, 0, 3, 0, 3, 4);
        System.out.println("triangle1: " + triangle1);
        System.out.println("triangle1 perimetri: " + triangle1.getPerimeter());
        System.out.println("triangle1 turi: " + triangle1.getType());

        // 2. MyPoint obyektlari orqali uchburchak yaratish
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(2, 2);
        MyPoint p3 = new MyPoint(4, 0);
        MyTriangle triangle2 = new MyTriangle(p1, p2, p3);
        System.out.println("\ntriangle2: " + triangle2);
        System.out.println("triangle2 perimetri: " + triangle2.getPerimeter());
        System.out.println("triangle2 turi: " + triangle2.getType());

        // 3. Teng tomonli uchburchakni tekshirish
        MyTriangle equilateralTriangle = new MyTriangle(0, 0, 2, 3, 4, 0);
        System.out.println("\nequilateralTriangle: " + equilateralTriangle);
        System.out.println("equilateralTriangle perimetri: " + equilateralTriangle.getPerimeter());
        System.out.println("equilateralTriangle turi: " + equilateralTriangle.getType());

        // 4. Teng yonli uchburchakni tekshirish
        MyTriangle isoscelesTriangle = new MyTriangle(0, 0, 4, 0, 2, 3);
        System.out.println("\nisoscelesTriangle: " + isoscelesTriangle);
        System.out.println("isoscelesTriangle perimetri: " + isoscelesTriangle.getPerimeter());
        System.out.println("isoscelesTriangle turi: " + isoscelesTriangle.getType());

        // 5. Turli tomonli uchburchakni tekshirish
        MyTriangle scaleneTriangle = new MyTriangle(1, 2, 4, 6, 7, 1);
        System.out.println("\nscaleneTriangle: " + scaleneTriangle);
        System.out.println("scaleneTriangle perimetri: " + scaleneTriangle.getPerimeter());
        System.out.println("scaleneTriangle turi: " + scaleneTriangle.getType());
    }
}
