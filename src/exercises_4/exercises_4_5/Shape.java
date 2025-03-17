package exercises_4.exercises_4_5;

public class Shape {
    private String color;
    private boolean filler;

    public Shape() {
        this.color="red";
        this.filler=true;
    }

    public Shape(String color, boolean filler) {
        this.color = color;
        this.filler = filler;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFiller() {
        return filler;
    }

    public void setFiller(boolean filler) {
        this.filler = filler;
    }

    @Override
    public String toString() {
        return "Shape[" +
                "color='" + color + '\'' +
                ", filler=" + filler +
                ']';
    }
}
