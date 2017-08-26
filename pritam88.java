class agrawal
{


	boolean prime( int n )
	{
  		int i,r,f=1;

		for( i=2; i<n; i++ )
		{
			if ( n%i == 0 )
			{
				f=0;	
				break;
			}	
		}

		if ( f==1 )
		return true;
		else
		return false;
	}
}


class pritam88
{
	public static void main(String args[])
	{
		agrawal  ob = new agrawal();


		boolean  p = ob.prime( 25 );
		
		if ( p )
		System.out.println( "This is  prime");
		else
		System.out.println( "This is not prime");

	}
}



