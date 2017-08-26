class raja3
{
	public static void main( String args[] )
	{
		int a=10,b=5,c;
		int []x = new int[5];
		
		try
		{		
			c = a/b;
			System.out.println("Answer =   " + c );

			x[7] = 200;
			System.out.println( x[7] );

		}
		catch(Exception  ex )
		{
			System.out.println(  "My Error =  " +   ex );
		}


	System.out.println("End prog");
	}
}