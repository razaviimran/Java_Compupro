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
	void add( date x, date y )
	{
		age = x.age + y.age;
	}
}

class exam4
{
	public static void main( String args[] )
	{
		date  a  = new date( 450);
		date  b  = new date( 200  );
		date  c  = new date();

		c.add( a, b );
	
		a.showage();
		b.showage();
		c.showage();
	}
}