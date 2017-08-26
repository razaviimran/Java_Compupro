class figure
{
	double dim1;
	double dim2;

	figure( double a, double b)
	{
	dim1=a;
	dim2=b;
	}

	double area()
	{
	System.out.println("Area for Figure is undefined.");
	return 0;
	}
}

class Rectangle extends figure
{
	Rectangle( double a, double b)
	{
		super (a, b);
	}

	double area()
	{
		System.out.println("Inside Area for Rectangle.");
		return dim1*dim2;
      	}
}


class Triangle extends figure
{
	Triangle( double a, double b )
	{
		super (a, b);
      	}

	double area()
	{
		System.out.println ("Inside Area for Triangle.");
		return  dim1*dim2/2;
	}
}

class file1
{
	public static void main( String args[] )
	{
	figure f = new figure (10, 10);
	Rectangle r= new Rectangle(9,5);
	Triangle t = new Triangle (10,8);
	
	figure  fig;

	fig = f;
	System.out.println( "Area is  " + fig.area() ) ;

	fig = t;
	System.out.println("Area is  "+ fig.area() ) ;

	fig = r;
	System.out.println (" Area is" + fig.area() ) ;

	}
}
 
