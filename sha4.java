class shashi
{
	private double h,w,d;

	shashi()
	{ 
	h=w=d=4;
	}

	shashi( double x, double y, double z )
	{
		h = x;
		w = y;
		d  = z;
	}
	
	double volume()
	{
	return h*w*d;
	}
}

class sha4
{
public static void main( String args[] )
{
	shashi   x = new shashi( 3,3,3 );
	shashi   y = new shashi( 2,2,2 );
	shashi   z = new shashi();
	
	double v;

	v = x.volume();
	System.out.println( "Volume = " +v );

	v = y.volume();
	System.out.println( "Volume = " +v );


	v = z.volume();
	System.out.println( "Volume = " +v );

	z = x;
	v = z.volume();
	System.out.println( "Volume = " +v );
}
}
