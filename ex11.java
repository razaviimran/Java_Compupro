class ex11
{
	public static void main( String args[] )
	{
		int x=10,y=0,z;
		int a[] = new int[5];

			try
			{
				a[6] = 10;
				System.out.println( "Answer =  " +a[6]  );
				z = x/y;
				System.out.println("Ans =  " +z  );

			}
			catch( ArithmeticException  xx )
			{
			System.out.println("My Error =  " +xx );
			}
			catch( ArrayIndexOutOfBoundsException xx )
			{
				System.out.println("My Error =  " +xx );
			}
			finally
			{
				System.out.println("Its always run");
			}	
		

	System.out.println( "Hello Friend");
	}
}