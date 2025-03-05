package regularPolygon;

class RegularPolygon {
    int n;
    double side;
    double x;
    double y;
    RegularPolygon(){
        n=3;
        side=1;
        x=0;
        y=0;
    }
    RegularPolygon(int n,double side){
        this.n=n;
        this.side=side;
        this.x=0;
        this.y=0;
    }
    RegularPolygon(int n,double side,double x,double y){
        this.n=n;
        this.side=side;
        this.x=x;
        this.y=y;
    }

    void getPerimeter(){

        System.out.printf("Peremetr of Polygon:%f%n",side*n);
    }
    void getArea(){
        System.out.printf("Area of Polygon:%f",n*Math.pow(side,2)/(4*Math.tan(Math.PI/n)));
    }
    void print(){
        System.out.println("n:"+n);
        System.out.println("side:"+side);
        System.out.println("x:"+x);
        System.out.println("y:"+y);
    }

}
