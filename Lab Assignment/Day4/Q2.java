/*
Q.2. Write a program to design a class Volume and then find out the volume of a
Cube, Cylinder and Ellipsoid using method overloading using BufferedReader class
object.
*/

import java.io.*;

class Volume{
    
    int a;
    public Volume(int a){
        this.a = a;
    }
    int r;
    int h;
    public Volume(int r, int h){
        this.r = r;
        this.h = h;
    }
    int p;
    int q;
    int s;

    public Volume(int p, int q, int s){
        this.p = p;
        this.q = q;
        this.s= s;
    }

    public void calcVol(int a){
        System.out.println("The volume of Cube is :" + a*a*a);
    }
    public void calcVol(int r,int h){
        System.out.println("The volume of cylinder is " + Math.PI*r*r*h);
    }
    public void calcVol(int p, int q, int s){
        System.out.println("the volume of Ellipsoid is "+ 4*(Math.PI*p*q*s)/3);
    }
}

public class Q2 {
    public static void main(String[] args) throws IOException{

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.print("Enter the side of cube : ");
            int a = Integer.parseInt(br.readLine());
            new Volume(a).calcVol(a);

            System.out.print("enter the radius of cylinder : ");
            int r = Integer.parseInt(br.readLine());
            System.out.print("Enter the height of the cylinder : ");
            int h = Integer.parseInt(br.readLine());
            new Volume(r, h).calcVol(r, h);

            System.out.print("enter the radius 1 of ellipsoid : ");
            int p= Integer.parseInt(br.readLine());
            System.out.print("Enter the radius 2 of the ellipsoid : ");
            int b = Integer.parseInt(br.readLine());
            System.out.println("Enter the radius 3 of the ellipsoid : ");
            int c = Integer.parseInt(br.readLine());
            new Volume(p, b, c).calcVol(p, b, c);

        }
        
    }
}
