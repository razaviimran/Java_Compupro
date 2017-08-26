class ayub
{
	private int age;

	public ayub()
	{
		age = 0;
	}

	public ayub( int age )
	{
		this.age = age;
	}

	public ayub( ayub pp )
	{
		age = pp.age;
	}

	void showage()
	{
		System.out.println( "My age is = " +age );
	}
}

class test6
{
	public static void main ( String args[] )
	{
		ayub  x = new ayub( 50 );
		ayub  y = new ayub( 45 );
		ayub  z = new ayub( y );

		x.showage();
		y.showage();
		z.showage();
	}
}