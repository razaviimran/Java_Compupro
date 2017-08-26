
class ex4
{
	public static void main( String args[] )  
	{
		int x=15,y=0,z;
		int a[] = new int[5];

		try
		{
			z=x/y;
			a[7] = 18;
			System.out.println( a[4] );
		}
		catch( Exception e )
		{
			System.out.println("my error = " +e );
		}

	}
}

