class exc1
{
   	public static void main(String args[])
	{
	   	   int a=15, b=0, c;
		   int x[] = new int[5];

		   try
		   { 		
			x[7] = 23;
		   	c = a/b;
		   	System.out.println("out put =    " +c );
		   }
		   catch( ArithmeticException   e    )
		   {
			System.out.println("My Error   ===  "  +e );
		   }
		   catch( ArrayIndexOutOfBoundsException e )
		   {
			System.out.println( "Out of range......... " +e ); 
		   }				
	}
} 






