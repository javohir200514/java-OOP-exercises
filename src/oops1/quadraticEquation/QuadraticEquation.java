package oops1.quadraticEquation;

class QuadraticEquation {
    int a;
    int b;
    int c;
    QuadraticEquation(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    double getDiscriminant(){
        double Discriminant=(Math.pow(b,2)-4*a*c);
        if(Discriminant>0) {
            return Discriminant;
        }else{
            return 0;
        }

    }

    void getRoot1(){
        if(getDiscriminant()>=0){
        System.out.println("Root 1:"+(-b+Math.sqrt(getDiscriminant()))/(2*a));}
        else {
            System.out.println("Root 1: 0");
        }
    }

    void getRoot2(){
        if(getDiscriminant()>=0){
        System.out.println("Root 2:"+(-b-Math.sqrt(getDiscriminant()))/(2*a));}
        else {
            System.out.println("Root 2: 0");
        }
    }

    void print(){
        System.out.println("Quadratic eqution:"+a+"x*x+"+b+"x+"+c);
    }

}
