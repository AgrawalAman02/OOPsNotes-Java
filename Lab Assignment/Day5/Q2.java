/*
Q.2.Create a package called “Shape”. Inside this package define a class named as “Figure”, which
computes the volume of a cube, cylinder and rectangular box using method overloading. Access the
class and methods from another file.
*/


//  in package Shape I had created the Figure class 
package Shape;

public class Figure{
    
    
    

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

// in a file outside the Folder Shape i had created a file Text.java having class Test where i m importing the Shape package and its methods
import Shape.*;

class Test {
    public static void main(String[] args) {
        Figure f = new Figure();

        f.calcVol(2);
        f.calcVol(2,3);
        f.calcVol(2,3,4);
    }
}
