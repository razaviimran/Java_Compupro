class date
{
	private int age;
	
	void setval()
	{
		age = 0;
	}		

	void setval( int aa )
	{
		age = aa;
	}		

	void setval( int aa , int  bb )
	{
		age = aa+bb;
	}		

	public void showage()
	{
		System.out.println("Your age is = " +age );
	}
}
class exam1
{
	public static void main( String args[] )
	{
		date  a  = new date();
		date  b  = new date();
		date  c  = new date();

		a.setval(  );
		b.setval( 30 );
		c.setval(  50,5 );
		
		a.showage();
		b.showage();
		c.showage();
	}
}