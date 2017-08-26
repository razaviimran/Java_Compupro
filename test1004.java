class shape
{
	public double r, l,b;
		
	shape( double x )
	{
		r = x;
	}


	shape( double x , double y )
	{
		l = x;
		b = y;
	}
	public void area_circle()
	{
		System.out.println("Ans = " +( 3.142*r*r)  ); 
	}
	public void area_rectangle()
	{
		System.out.println("Ans = " +( l*b )   ); 
	}
}

class test1004
{
	
	public static void main( String args[] )
	{
		shape cc  = new shape( 14 );
		shape rr = new shape(40,4);

		cc.area_circle();
		rr.area_rectangle();
	}
}
