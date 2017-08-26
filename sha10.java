/* polymorphicm 
compile time polymorphics  // static binding 
raj()
{
}

raj(int a )
{
}

raj( int a, int b )
{
}

raj( float a  )
{
}

x.raj( 33.33 );
*/


//method overriding  // function overrding

class shashi
{
	public void test()
	{
	System.out.println( "Test  of  shashi" );
	}
}

class imran  extends shashi
{
	public void test()
	{
	System.out.println( "Test  of  imran" );
	}
}


class sha10
{
public static void main( String args[] )
{
	imran  s  = new  imran();
	
	s.test();
}
}