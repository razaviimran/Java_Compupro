class prime
{
	public void findprime( int n )
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
		System.out.println( "This is not prime Number ");
		else
		System.out.println( "This is prime Number ");
	}
}

class sapana_prime3
{
	public static void main( String args[] )
	{
		prime  p = new prime();

		p.findprime( 23 );
	}
}