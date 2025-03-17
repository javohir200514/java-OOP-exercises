package exercises_4.exercises_4_5;

public class Square extends Rectangle{

    public  Square(){
        super();
    }

    public  Square(double side){
        super(side,side);
    }

    public Square(double side,String color, boolean filler) {
        super(color, filler,side,side);
    }

    public double getSide(){
        return getLength();
    }

    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    public void setWidth(double side){
        super.setWidth(side);
    }

    public void setLength(double side){
        super.setLength(side);
    }

    public String toString(){
        return "Square["+super.toString()+"]";
    }
}
