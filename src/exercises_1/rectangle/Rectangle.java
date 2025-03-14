package exercises_1.rectangle;

public class Rectangle {

    private float length;
    private float width;

    public Rectangle(){
        length=1.0f;
        width=1.0f;
    }

    public Rectangle(float length,float width){
        this.length=length;
        this.width=width;
    }

    public float getWidth() {
        return width;
    }

    public float getLength() {
        return length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public double getArea(){
        return length*width;
    }

    public double getPeremetr(){
        return 2*(length+width);
    }

    @Override
    public String toString() {
        return "Rectangle[" +
                "length=" + length +
                ", width=" + width +
                ']';
    }
}
