class sapana_prime1
{
	public static void main( String args[] )
	{
		int i, r, flag=1;
		int n = 9;
		
		for( i=2; i<n;  i++ )
		{
			r = n%i;
			if  ( r==0 )
			{
				flag = 0;
				break;
			}	
		}     	

		if ( flag == 0 )
		System.out.println( "This is not prime Number ");
		else
		System.out.println( "This is prime Number ");
	

	}
}