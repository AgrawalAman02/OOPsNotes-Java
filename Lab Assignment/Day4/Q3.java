/*
Q.3.Write a program to design a class Volume and then find out the volume of a
Cube, Cylinder and Ellipsoid using method overloading using command line
argument.
*/

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

public class Q3 {
    public static void main(String[] args) {


        for(int i = 0 ; i<args.length; i++)
		{
			
			if(args[i].equals("cube"))
			{		
                new Volume(Integer.parseInt(args[i+1])).calcVol(Integer.parseInt(args[i+1]));
			}
			if(args[i].equals("cylinder"))
			{		
                new Volume(Integer.parseInt(args[i+1]), Integer.parseInt(args[i+2])).calcVol(Integer.parseInt(args[i+1]),Integer.parseInt(args[i+2]));
			}
			if(args[i].equals("ellipssoid"))
			{		
                new Volume(Integer.parseInt(args[i+1]),Integer.parseInt(args[i+2],Integer.parseInt(args[i+3]))).calcVol(Integer.parseInt(args[i+1]),Integer.parseInt(args[i+2],Integer.parseInt(args[i+3])));
			}
		}
    
        
    }

}
