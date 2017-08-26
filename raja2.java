class raja2
{
	public static void main( String args[] )
	{
		int a=10,b=0,c;
		int []x = new int[5];
		
		try
		{		
			c = a/b;
			System.out.println("Answer =   " + c );

			x[2] = 200;
			System.out.println( x[2] );

		}
		catch( ArithmeticException  ex )
		{
			System.out.println(  "My Error =  " +   ex );
		}
		catch( ArrayIndexOutOfBoundsException  ex )
		{
			System.out.println(  "My Error =  " +   ex );
		}
		finally
		{
			System.out.println(  "Always Runn " );
		}	


	System.out.println("End prog");
	}
}