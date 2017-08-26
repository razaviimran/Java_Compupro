class ex13
{
	public static void main( String args[] )
	{
		int x=10,y=5,z;
		int a[] = new int[5];

			try
			{
				z = x/y;
				System.out.println("Ans =  " +z  );

				a[6] = 10;
				System.out.println( "Answer =  " +a[6]  );
			}
			catch( Exception  xx )
			{
				System.out.println("My Testing  Error =  " +xx );
			}
			finally
			{
				System.out.println("Its always run");
			}	
		
	System.out.println( "Hello Friend");
	}
}