package exercises_2.exercises_2_9;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint(){
        x=0;
        y=0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {

        return x;
    }

    public int getY() {

        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int[] getXY() {
        return new int[]{x, y};
    }

    @Override
    public String toString() {
        return
                "(" + x +
                "," + y +
                ')';
    }

    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double distance(MyPoint another){
        return Math.sqrt(Math.pow(x-another.x,2)+Math.pow(y-another.y,2));
    }

    public double distance(){
        return Math.sqrt(Math.pow(x,2)-Math.pow(y,2));
    }
}
