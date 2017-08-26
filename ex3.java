
class ex3
{
	public static void main( String args[] )  
	{
		int x=15,y=0,z;
		int a[] = new int[5];

		try
		{
			a[7] = 18;
			z=x/y;
			System.out.println( a[4] );
		}
		catch( ArithmeticException e )
		{
			System.out.println("my error = " +e );
		}
		catch( ArrayIndexOutOfBoundsException e )
		{
			System.out.println("my error = " +e );
		}

	}
}

