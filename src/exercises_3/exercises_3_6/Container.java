package exercises_3.exercises_3_6;

public class Container {
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    Container(int x, int y, int width, int height){
        this.x1=x;
        this.x2=y;
        this.x2=x+width;
        this.y2=height;
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth() {
        return x2-x1;
    }

    public int getHeight() {
        return y2-y1;
    }

    public boolean collidesWith(Ball ball) {
        if (ball.getX() - ball.getRadius() <= this.x1 ||
                ball.getX() - ball.getRadius() >= this.x2) {
            ball.reflectHorizontal();
            return true;
        }
        return false;
    }


}
