package exercises_4.exercises_4_1;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        height=1.0;
    }

    public Cylinder(double radius){
        super(radius);
        height=1.0;
    }

    public Cylinder(double redius,double height){
        super(redius);
         this.height=height;
    }

    public Cylinder(double redius,double height,String color){
        super(redius,color);
        this.height=height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return  getArea()*height;
    }

    public String toString() {
        return "Cylinder: subclass of " + super.toString()
                + " height=" + height;
    }
}
