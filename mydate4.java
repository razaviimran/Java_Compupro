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

	date ( int x, int y )
	{
		age = x+y;
	}

	public void showage()
	{
		System.out.println("Your age is = " +age );
	}

	void sum( int p, int q )
	{
		age = p + q;
	}
}

class mydate4
{
	public static void main( String args[] )
	{

		date  a = new date( 20 );
		date  b = new date( 30 );
		date  c = new date();

		c.sum( 70, 90 );		

		a.showage();
		b.showage();
		c.showage();
	}
}