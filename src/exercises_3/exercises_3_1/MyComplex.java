package exercises_3.exercises_3_1;

public class MyComplex {
    private double real;
    private double imag;

    MyComplex(){
        this.real=0;
        this.imag=0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real,double imag){
        this.imag=imag;
        this.real=real;
    }

    public boolean isReal(){
        if(imag==0){
            return true;
        }
        return  false;
    }

    public boolean isImaginary(){
        if(real==0){
            return true;
        }
        return  false;
    }

    public boolean equals(){
        if(real==imag){
            return true;
        }
        return  false;
    }

    public boolean equals(MyComplex another){
        if(this.real==another.real&&this.imag==another.imag){
            return true;
        }
        return false;
    }

    public double magnitude(){
        return Math.sqrt(imag*imag+real*real);
    }

    public MyComplex addInto(MyComplex right){
        this.real=this.real+ right.real;
        this.imag=this.imag+ right.imag;
        return this;

    }

    public MyComplex addNew(MyComplex right){

        return new MyComplex(real=this.real+ right.real,imag=this.imag+ right.imag);

    }

    @Override
    public String toString() {
        return "MyComplex[" +
                 real +
                "+" + imag +"*i"+
                ']';
    }
}
