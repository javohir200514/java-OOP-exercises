package oops1.linearEquation;

public class LinearEquation {
    int a;
    int b;
    int c;
    int d;
    int e;
    int f;

    LinearEquation(int a,int b,int c,int d,int e,int f){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
        this.f=f;
    }
    void isSolvable(){
        if(a*d-b*c==0) {
            System.out.println("The equation has no solution");
        }
    }

    void getX(){
        if(a*d-b*c!=0){
            System.out.println("x :"+(double)(e*d-b*f)/(a*d-b*c));
        }
    }

    void getY(){
        if(a*d-b*c!=0){
            System.out.println("y :"+(double)(a*f-e*c)/(a*d-b*c));
        }
    }


}
