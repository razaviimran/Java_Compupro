class ex5
{
	public static void main( String args[] )  
	{
		int a[] = new int[5];

		try
		{
			a[8] = 18;
			System.out.println( a[4] );
		}
		catch( ArrayIndexOutOfBoundsException e )
		{
			System.out.println("my error = " +e );
		}
		catch( Exception e )
		{
			System.out.println("my error = " +e );
		}

	}
}

