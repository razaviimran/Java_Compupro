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
	int sum( date  p )
	{
		int z = age + p.age;	
		return z; 
	}
}
class mydate6
{
	public static void main( String args[] )
	{
		date  a = new date( 20 );
		date  b = new date( 30 );
		date  c = new date();

		int z = a.sum( b );		
		System.out.println("Total = " +z );

		a.showage();
		b.showage();
		c.showage();
	}
}