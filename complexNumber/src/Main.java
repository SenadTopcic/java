
class ComplexNumber {
    int real;
    int imaginary;

    //Constructor
    ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    void print(){
        //2 + 3i
        System.out.println(real + " + " + imaginary + "i");
    }

    ComplexNumber add(ComplexNumber complexNum) {
        int sumReal = real + complexNum.real;
        int sumImaginary = imaginary + complexNum.imaginary;
        //ComplexNumber result = new ComplexNumber(sumReal,sumImaginary);
        return new ComplexNumber(sumReal,sumImaginary);
    }
}

public class Main {
    public static void main(String[] args) {
        ComplexNumber x = new ComplexNumber(2,3);
        x.print();

        ComplexNumber y = new ComplexNumber(-5,4);
        y.print();
        ComplexNumber sum = x.add(y);
        sum.print();
    }
}