
/*
Q.4.Create a class named complex with data members as real and imaginary.
Overload three constructors to initialize the data members (i.e. default, normal, and
through object initialization). Provide methods which returns object of the complex
class as the result for addition, subtraction, multiplication of two complex numbers.
*/

// this is my approach but the lab assistant denied so i am commenting this one and the updated one is below this 
/*
import java.io.*;

class Complex{
    int real;
    int imaginary;

    public Complex(){
        real = 0;
        imaginary = 0;
    }

    public Complex(int real ,int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex(Complex that){
        this.real = that.real;
        this.imaginary = that.imaginary;
    }

    public Complex add (Complex that){
        return new Complex(this.real+that.real,this.imaginary+ that.imaginary);
    }

    public Complex subtract(Complex that){
        return new Complex(this.real-that.real,this.imaginary - that.imaginary);
    }

    public Complex multiply(Complex that){
        return new Complex((this.real*that.real)-(this.imaginary*that.imaginary), (this.real*that.real)+(this.imaginary * that.imaginary));
    }

}

public class Q4 {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            Complex comp = new Complex();
            System.out.println("The complex no. using the default constructor is " + comp.real +" + "+comp.imaginary+"i");

            System.out.println("Enter the real part of the first complex no. (for parameterised constructor): ");
            int real = Integer.parseInt(br.readLine());
            System.out.println("Enter the imaginary part of the first complex no. (for parameterised constructor): ");
            int imaginary = Integer.parseInt(br.readLine());

            Complex comp1 =new Complex(real,imaginary);
            System.out.println("The first complex no. using the parameterised constructor is " + comp1.real +" + "+ comp1.imaginary +"i");

            System.out.println("Enter the real part of the second complex no. (for parameterised constructor): ");
            real = Integer.parseInt(br.readLine());
            System.out.println("Enter the imaginary part of the second complex no. (for parameterised constructor): ");
            imaginary = Integer.parseInt(br.readLine());
            Complex comp2 = new Complex(real, imaginary);
            System.out.println("The second complex no. using the parameterised constructor is " + comp2.real +" + "+ comp2.imaginary +"i");

            Complex add = comp1.add(comp2);
            Complex subtract = comp1.subtract(comp2);
            Complex multiply = comp1.multiply(comp2);

            System.out.println("The addition is "+ add.real +" + "+ add.imaginary+"i");
            System.out.println("The subtraction is "+ subtract.real +" + " +subtract.imaginary+"i");
            System.out.println("The multiplication is "+ multiply.real +" + " +multiply.imaginary+"i");


        }
    }
}
*/

import java.io.*;

class Complex{
    int real;
    int imaginary;

    public Complex(){
        real = 0;
        imaginary = 0;
    }

    public Complex(int real , int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex(Complex that){
        this.real= that.real+10;
        this.imaginary= that.imaginary+10;
    }

    public static Complex add(Complex a, Complex b){
        return new Complex(a.real+b.real , a.imaginary+b.imaginary);
    }

    public static Complex subtract(Complex a, Complex b){
        return new Complex(a.real-b.real , a.imaginary-b.imaginary);
    }
    
    public static Complex multiply(Complex a, Complex b){
        return new Complex((a.real*b.real)- (a.imaginary*b.imaginary), (a.real*b.real)+ (a.imaginary*b.imaginary));
    }

    public void display(){
        System.out.println("Compex Number : "+ real +" +"+imaginary+"i ");
    }
    
}

public class Q4{
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            Complex comp1 = new Complex();
            System.out.println("----------------------Default Constructor-------------------");
            comp1.display();
            System.out.println("----------------------For Parameterised Constructor-------------------");
            System.out.println("Enter the real part of the first complex no. : ");
            int real = Integer.parseInt(br.readLine());
            System.out.println("Enter the imaginary part of the first complex no. : ");
            int img = Integer.parseInt(br.readLine());
            Complex comp2 = new Complex(real,img);
            System.out.print("first Complex No:");
            comp2.display();

            System.out.println("Enter the real part of the second complex no. : ");
            real = Integer.parseInt(br.readLine());
            System.out.println("Enter the imaginary part of the se2cond complex no. : ");
            img = Integer.parseInt(br.readLine());
            Complex comp3 = new Complex(real,img);
            System.out.print("first Complex No:");
            comp3.display();

            System.out.print("The addition of both of them is :");
            Complex.add(comp2,comp3).display();
            System.out.print("The subtraction of both of them is :");
            Complex.subtract(comp2,comp3).display();
            System.out.print("The multiplication of both of them is :");
            Complex.multiply(comp2,comp3).display();

            System.out.println("----------------------Complex Object-------------------");
            Complex comp4 = new Complex(comp2);
            Complex comp5 = new Complex(comp3);

            System.out.print("The addition of both of them is :");
            Complex.add(comp4,comp5).display();
            System.out.print("The subtraction of both of them is :");
            Complex.subtract(comp4,comp5).display();
            System.out.print("The multiplication of both of them is :");
            Complex.multiply(comp4,comp5).display();
        }
        
    }
}


