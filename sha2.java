class shashi
{
	private double h,w,d;


	void setvalue( double x, double y, double z )
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

class sha2
{
public static void main( String args[] )
{
	shashi   x = new shashi();

	
	x.setvalue( 3,4,5 );
	x.volume();
}
}
