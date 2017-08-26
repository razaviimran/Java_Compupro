class prime
{
	public boolean findprime( int n )
	{
		int i, r;
		boolean flag=true;
		
		for( i=2; i<n;  i++ )
		{
			r = n%i;
			if  ( r==0 )
			{
				flag = false;
				break;
			}	
		}     	

		if ( flag==false )
		return false;
		else
		return true;
	}
}

class sapana_prime4
{
	public static void main( String args[] )
	{
		prime  p = new prime();
		
		boolean  x = p.findprime( 15 );

		if (  x==false )
		System.out.println( "Not prime");
		else
		System.out.println("prime");

	}
}



