
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

	void showage()
	{
		System.out.println( "My age is = " +age );
	}


	ayub sum(  ayub  y  )
	{
		ayub tm = new ayub();
	
		tm.age = age + y.age;

		return tm;
	}
}

class test5
{
	public static void main ( String args[] )
	{

		ayub  x = new ayub( 25 );
		ayub  y = new ayub( 45 );
		ayub  z = new ayub();

		z = x.sum( y );

		x.showage();
		y.showage();
		z.showage();
	}
}