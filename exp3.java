
class exp3
{
	public static void main(String args[] )
	{		
		int x=20, y=0,z;
		int a[] = new int[4];
		try
		{
			a[2]  = 100;
			z = x/y;
			System.out.println("arrays value  =  " +a[2]  );
		}
		catch( ArithmeticException e )
		{
			System.out.println( "My Error =  "+e ); 
		}
		catch( ArrayIndexOutOfBoundsException e )
		{
			System.out.println( "My Error =  "+e ); 
		}
	}
}