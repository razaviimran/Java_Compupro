class ex1
{
	public static void main( String args[] )  
	{
		int x=15,y=0,z;

		try
		{
			z = x/y;
			System.out.println( "z = " +z );					
		}
		catch( ArithmeticException e )
		{
			System.out.println( "My error name is khushboo == " +e );
		}	

	}
}

