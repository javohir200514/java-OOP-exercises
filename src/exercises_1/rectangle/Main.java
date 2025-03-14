package exercises_1.rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(5.6f,7.8f);
        System.out.println(rectangle);
        System.out.println("Rectangle area:"+rectangle.getArea());
        System.out.println("Rectangle perimetr:"+rectangle.getPeremetr());
    }
}
