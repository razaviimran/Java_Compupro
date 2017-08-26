class shashi
{
	private double h,w,d;

	shashi( double x, double y, double z )
	{
		h = x;
		w = y;
		d  = z;
	}
 	
	void volume()
	{
	double v = h*w*d;
	System.out.println( "volume of cube = " +v );
	}
}

class sha3
{
public static void main( String args[] )
{
	shashi   x = new shashi( 1,1,1 );
	shashi   y = new shashi( 2,2,2 );


/*	x.volume();
	y.volume();*/
}
}
