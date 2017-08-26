class pritam8
{
	public static void main(String args[])
	{
  		int i,r,n=15,f=0;

		for( i=2; i<n; i++ )
		{
			if ( n%i == 0 )
			{
				f=1;	
				break;
			}
				
		}

		if ( f==1 )
		System.out.println("This is not prime");		
		else	
		System.out.println("This is  prime");
	}
}



