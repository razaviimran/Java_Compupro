
class trupti
{
	private int age;

	trupti()
	{
		age=0;
	}

	trupti( int a )
	{
		age=a;
	}

	void showage()
	{
		System.out.println( "Your age is = "  +age );
	}

	boolean equal(  trupti  p )
	{
		if ( age == p.age )
		return true;
		else
		return false;
	}

}

class archu3
{
	public static void main( String args[] )
	{
		trupti  x = new trupti( 20 );
		trupti  y = new trupti( 20 );

		x.showage();
		y.showage();

		if (  x.equal( y )  )
		System.out.println ( "value are equal" );
		else
		System.out.println ( "value are not equal" );


	}
}