package exercises_4.exercises_4_5;

public class Circle extends Shape{
    private double radius;

    public Circle() {
        this.radius=1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filler, double radius) {
        super(color, filler);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return  Math.PI*radius*radius;
    }

    public double getPerimetr(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle[" +super.toString()+
                "radius=" + radius +
                ']';
    }
}
