class ganesh
{
	double l;
	double w;

	ganesh()
	{
		l = 0;
		w = 0;
	}

        ganesh(double p)
	{
		l = p;
		w = p;
	}

        ganesh( ganesh m )
	{
		l = m.l;
		w = m.w;
	}

	ganesh( double x, double y )
	{
		l = x;
		w = y;
	}

	double area()
	{
		return (l*w);
	}
}

class sapana7
{
	public static void main( String args[] )
	{
		ganesh   ob1 =  new ganesh();
		ganesh   ob2 =  new ganesh(10);
		ganesh   ob3 =  new ganesh(6,6);

		ganesh   k =  new ganesh( ob3 );

		System.out.println( "Area = " + ob1.area() );
		System.out.println( "Area = " + ob2.area() );
		System.out.println( "Area = " + ob3.area() );

		System.out.println( "Area = " + k.area() );
	}
}