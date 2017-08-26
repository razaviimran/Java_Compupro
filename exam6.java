
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

	int  add( date x  )
	{
		int z = age +  x.age ;
		return z;
	}	
}

class exam6
{
	public static void main( String args[] )
	{
		date  a  = new date( 4 );
		date  b  = new date( 2 );
		date  c  = new date( 0 );

		int z = a.add( b );
		System.out.println("Total age = " +z );
	
		a.showage();
		b.showage();
		c.showage();
	}
}