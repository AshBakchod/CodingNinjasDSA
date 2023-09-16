package Lecture1_OOPS1;

public class ComplexNumbers {
    int real;
    int imaginary;
    // Complete this class
    public ComplexNumbers(int real,int imaginary ){
        this.real = real;
        this.imaginary=imaginary;
    }

    void plus(ComplexNumbers c){

        ComplexNumbers n = new ComplexNumbers(this.real+c.real,this.imaginary+c.imaginary);
        this.real= n.real;
        this.imaginary=n.imaginary;
    }
    void multiply(ComplexNumbers c){

        ComplexNumbers n = new ComplexNumbers((this.real*c.real)-(this.imaginary*c.imaginary),(this.real*c.imaginary)+(this.imaginary*c.real));
        this.real= n.real;
        this.imaginary=n.imaginary;
    }
    void print(){
        System.out.println(this.real + " " + "+" + " " + "i" + this.imaginary);
    }
}

