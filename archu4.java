
class Test
{
	private int a,b;

	Test()
	{
		a=0;
		b=0;
	}

	Test( int x , int y )
	{
		a=x;
		b=y;
	}

	void showage()
	{
		System.out.println( "Your age is = a  = "  +a  +"  b =   "   +b  );
	}

	boolean equal(  Test  p )
	{
		if ( a == p.a && b ==p.b  )
		return true;
		else
		return false;
	}

}

class archu4
{
	public static void main( String args[] )
	{
		Test  x = new Test( 20, 20 );
		Test  y = new Test( 20, 20 );

		x.showage();
		y.showage();

		if (  x.equal( y )  )
		System.out.println ( "value are equal" );
		else
		System.out.println ( "value are not equal" );


	}
}