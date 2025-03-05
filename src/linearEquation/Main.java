package linearEquation;

public class Main {
    public static void main(String[] args) {
        LinearEquation linearEquation=new LinearEquation(2,1,7,0,1,4);
        linearEquation.isSolvable();
        linearEquation.getX();
        linearEquation.getY();
    }
}
