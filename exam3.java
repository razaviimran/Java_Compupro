class date
{
	private int age;
	
	date()
	{
		age = 0;
	}		

	date( int aa )
	{
		age = aa;
	}		

	date( int aa , int  bb )
	{
		age = aa+bb;
	}		

	public void showage()
	{
		System.out.println("Your age is = " +age );
	}

	void add( int x, int y )
	{
		age = x+y;
	}
}

class exam3
{
	public static void main( String args[] )
	{
		date  a  = new date( 10);
		date  b  = new date(20 );
		date  c  = new date( 30 );

		c.add( 44, 55 );
	
		a.showage();
		b.showage();
		c.showage();
	}
}