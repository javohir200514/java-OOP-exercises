package exercises_3.exercises_3_2;

public class MyPolynomial {
    private double[] coeffs;

    /*public MyPolynomial(double coeffs) {
        for (int i = 0; i <getDegree() ; i++) {

            this.coeffs[i] = coeffs[i];
        }
    }*/

    public int getDegree(){
        return coeffs.length+1;
    }

    public double evaluate(double x){
        double sum=0;
        for (int i = 0; i < getDegree(); i++) {
            sum+=coeffs[i]*Math.pow(x,i);
        }
        return sum;
    }

    /*public MyPolynomial add(MyPolynomial right){
        for (int i = 0; i <getDegree() ; i++) {

        }
    }

    public MyPolynomial multiply(MyPolynomial right){

    }*/
}
