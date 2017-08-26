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

	date sum( date  p )
	{
		date tm = new date();

		 tm.age = age + p.age;	

		return tm; 
	}
}

class mydate7
{
	public static void main( String args[] )
	{

		date  a = new date( 20 );
		date  b = new date( 30 );
		date  c = new date();

		c  = a.sum( b );		

		a.showage();
		b.showage();
		c.showage();
	}
}