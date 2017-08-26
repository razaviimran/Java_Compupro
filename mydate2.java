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

	void add2()
	{
		age = age + 2;
	}
}

class mydate2
{
	public static void main( String args[] )
	{
		date  a = new date();
		date  b = new date( 30);
		date  c = new date( 20,60 );
		a.showage();
		b.showage();
		c.showage();
	}
}