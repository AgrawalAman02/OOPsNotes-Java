class Circle
{
	int r; 
	Circle(int r)
	{
	 this.r = r;
	 }
	int perimeter ()
	{ 
	 return 2*(22/7)*r;
	}
	int area ()
	{ 
	return (22/7)*r*r;
	}
}
class Square
{
	int r; 
	Square(int r)
	{ 
	 this.r = r;
	 }
	int perimeter ()
	{
	 return 4*r;
	}
	int area ()
	{ 
	 return r*r;
	}
}

class Rectangle
{
	int l; 
	int b;
	Rectangle(int l, int b)
	{ 
	 this.l = l;
	 this.b = b;
	 }
	int perimeter ()
	{
	 return 2*(l+b);
	}
	int area ()
	{ 
	 return l*b;
	}

}


		
	
	

class P4
{
	public static void main(String[] args)
	{
		for(int i = 0 ; i<args.length; i++)
		{
			
			if(args[i].equals("r"))
			{		
				Rectangle r = new Rectangle(Integer.parseInt(args[i+1]) , Integer.parseInt(args[i+2]));
				System.out.println("the area is " + r.area() + " and the perimeter is " + r.perimeter());
			}
			if(args[i].equals("c"))
			{		
				Circle c = new Circle(Integer.parseInt(args[i+1]));
				System.out.println("the area is " + c.area() + " and the perimeter is " + c.perimeter());
			}
			if(args[i].equals("s"))
			{		
				Square s = new Square(Integer.parseInt(args[i+1]));
				System.out.println("the area is " + s.area() + " and the perimeter is " + s.perimeter());
			}
		}
	}
}
