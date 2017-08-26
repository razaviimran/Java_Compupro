class raja1
{
	public static void main( String args[] )
	{
		int a=10,b=5,c;
//		int []x = { 2,3,4,5};
		int []x = new int[5];
		
		try
		{		
			c = a/b;
			System.out.println("Answer =   " + c );
		}
		catch( ArithmeticException  ex )
		{
			System.out.println(  "My Error =  " +   ex );
		}


		try
		{
		x[7] = 200;
		System.out.println( x[2] );
		}
		catch( ArrayIndexOutOfBoundsException  ex )
		{
			System.out.println(  "My Error =  " +   ex );
		}



	System.out.println("End prog");
	}
}