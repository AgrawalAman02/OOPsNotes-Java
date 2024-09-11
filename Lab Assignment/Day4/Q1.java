/*
Q.1. Write a program to calculate the area of a Rectangle, a Circle and a Square
with parameterized constructor (to initialize the dimensions) and methods (to
calculate the area) using BufferedReader class object.
*/


import java.io.*;
interface Area
{
	void calculateArea();
}

class Rectangle implements Area
{
	int l;
	int b;
	public Rectangle(int l, int b)
	{
		this.l = l;
		this.b = b;
	}

	public void calculateArea()
	{
		System.out.println("The Area of rectangle is : " + l*b);
	}


}

class Circle implements Area
{	
	int r;
	public Circle(int r)
	{
		this.r = r;
	}
	
	public void calculateArea()
	{
		System.out.println("The Area of circle is : " + Math.PI*r*r);
	}
}

class Square implements Area
{
	int a;
	Square(int a)
	{
		this.a = a;
	}
	public void calculateArea()
	{
		System.out.println("The Area of the Square is : " + a*a);
	}
}



public class Q1{
	public static void main(String [] args) throws IOException{
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			System.out.print("Enter the length of the Rectangle : ");
			int l = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine());
			new Rectangle(l,b).calculateArea();
			
			System.out.print("Enter the radius of the circle : ");
			int r = Integer.parseInt(br.readLine());
			new Circle(r).calculateArea();

			
			System.out.print("Enter the side of the square : ");
			int a = Integer.parseInt(br.readLine());
			new Square(a).calculateArea();
		}
	}
}
