
class exp2
{
	public static void main(String args[] )
	{		
		int x=20, y=0,z;
		int a[] = new int[4];
		try
		{
			a[4]  = 100;
			System.out.println("arrays value  =  " +a[2]  );
		}
		catch( ArrayIndexOutOfBoundsException e )
		{
			System.out.println( "My Error =  "+e ); 
		}
	}
}