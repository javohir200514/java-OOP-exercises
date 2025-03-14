package exercises_2.exercises_2_8;

public class MyCircle {
    private MyPoint center;
    private int radius;

    MyCircle(){
        center=new MyPoint(0,0);
        radius=1;
    }
    MyCircle(int x,int y,int radius){
        center = new MyPoint(x, y);
        this.radius=radius;
    }
    MyCircle(MyPoint center,int radius){
        this.center=center;
        this.radius=radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getCenterX() {
        return center.getX();
    }

    public void setCenterX(int x) {
        center.setX(x);
    }

    public int getCenterY() {
        return center.getY();
    }

    public void setCenterY(int y) {
        center.setX(y);
    }

    public int[] getCenterXY() {
        return new int[]{center.getX(),center.getY()};
    }

    public void setCenterXY(int x,int y) {
        center=new MyPoint(x,y);
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    public double getCircumference(){
        return 2*Math.PI*radius;
    }

    public double distance(MyCircle another){
        return center.distance(another.center);
    }

    @Override
    public String toString() {
        return "MyCircle{" +
                "center=" + center.toString() +
                ", radius=" + radius +
                '}';
    }
}
