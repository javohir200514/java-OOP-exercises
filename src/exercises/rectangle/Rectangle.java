package exercises.rectangle;

class Rectangle {
    double width;
    double height;
    Rectangle(){
        width=1;
        height=1;
    }
    Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }
    void getArea(){
        System.out.printf("Area of rectangle:%f%n",width*height);
    }

    void getPerimetr(){

        System.out.printf("Perimetr of rectangle:%f",2*(width+height));
    }
}
