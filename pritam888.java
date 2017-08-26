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

class pritam888
{
	public static void main(String args[])
	{
		agrawal  ob = new agrawal();
		for( int k=1; k<=500; k++ )
		{
			boolean  p = ob.prime( k );
		
			if ( p )
			System.out.println( k );
		}
	}
}



