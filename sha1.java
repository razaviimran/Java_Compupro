class shashi
{
	double h,w,d;

	void volume()
	{
	double v = h*w*d;
	System.out.println( "volume of cube = " +v );
	}
}

class sha1
{
public static void main( String args[] )
{
	shashi   x = new shashi();

	x.h = 2;
	x.w = 4;
	x.d = 6;

	x.volume();
}
}
