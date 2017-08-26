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
date  add( date x  )
	{
		date tm = new date();
		tm.age = age +  x.age ;
		return tm;
	}	
}

class exam7
{
	public static void main( String args[] )
	{
		date  a  = new date( 4 );
		date  b  = new date( 2 );
		date  c  = new date( 0 );
		c = a.add( b );
		a.showage();
		b.showage();
		c.showage();
	}
}