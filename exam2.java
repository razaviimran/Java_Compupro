class date
{
	int age;
	
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
}

class exam2
{
	public static void main( String args[] )
	{
		date  a  = new date( 30);
		date  b  = new date(20 );
		date  c  = new date();

		c.age  = a.age  + b.age;
	
		a.showage();
		b.showage();
		c.showage();
	}
}