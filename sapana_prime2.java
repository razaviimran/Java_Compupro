class sapana_prime2
{
	public static void main( String args[] )
	{
		int i, r;
		boolean flag=true;
		int n = 19;
		
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