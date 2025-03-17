package exercises_3.exercises_3_7;

public class Player {
    private int number;
    private float x;
    private float y;
    private float z;

    public Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
        z=0;
    }

    public void move(float xDisp,float yDisp){
        this.x=x+xDisp;
        this.y=y+yDisp;
    }

    public boolean near(Ball ball){
        return Math.sqrt((ball.getX()-x)*(ball.getX()-x)+(ball.getY()-y)*(ball.getY()-y))<8;
    }

    public void kick(Ball ball){
    }
}
