
class exp1
{
	public static void main(String args[] )
	{		
		int x=20, y=0,z;

		try
		{
			z = x/y;
			System.out.println("z =  " +z );
		}
		catch( ArithmeticException e )
		{
			System.out.println( "My Error =  "+e ); 
		}
	}
}