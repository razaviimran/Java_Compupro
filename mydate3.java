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

class mydate3
{
	public static void main( String args[] )
	{
		date  a = new date( 20 );
		date  b = new date( 30 );
		date  c = new date();
		 a.add2();	
		 b.add2();
		a.showage();
		b.showage();
		c.showage();
	}
}
