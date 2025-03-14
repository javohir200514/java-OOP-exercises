package exercises.quadraticEquation;

public class Main {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation=new QuadraticEquation(1,6,9);
        quadraticEquation.print();
        quadraticEquation.getRoot1();
        quadraticEquation.getRoot2();
        System.out.println(quadraticEquation.getDiscriminant());
    }
}
