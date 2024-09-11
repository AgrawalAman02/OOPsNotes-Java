// INCOMPLETE


/*
Q.4.Create a class named complex with data members as real and imaginary.
Overload three constructors to initialize the data members (i.e. default, normal, and
through object initialization). Provide methods which returns object of the complex
class as the result for addition, subtraction, multiplication of two complex numbers.
*/

class Complex{
    int data;
    int imaginary;

    public Complex(){
        data = 0;
        imaginary = 0;
    }

    public Complex(int data, int imaginary){
        this.data = data;
        this.imaginary = imaginary;
    }

    public Complex(Complex comp){
        this.data= comp.data;
        this.imaginary = comp.imaginary;
    }
    
}
