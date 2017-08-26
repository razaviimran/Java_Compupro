class sheetal
{
	sheetal()
	{
		System.out.println("Constructor");
	}
	
	sheetal( int aa )
	{
		System.out.println("Constructor  = "  +aa );
	}

	sheetal( String str  )
	{
		System.out.println("Constructor  = "  +str );
	}

	public void test()
	{
		System.out.println("Hi i am sheetal function");
	}
}

class pritam
{

	public static void main( String args[] )
	{
		System.out.println("Hi Friend");
		System.out.println("Hi Java");

		System.out.println( args.length );

		for( int i=0; i<args.length; i++ )
		{
			System.out.println( args[i] );
		}			

		
		sheetal xx = new sheetal( "Akanksha" );

		xx.test();

	}

}



