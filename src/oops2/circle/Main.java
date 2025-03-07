package oops2.circle;

public class Main {
    public static void main(String[] args) {

        Circle circle=new Circle(2.2);
        System.out.println(circle);
        System.out.println("This circle area is :"+circle.getArea());
        System.out.println("This circle circumference length  is :"+circle.getCircumference());
    }
}
