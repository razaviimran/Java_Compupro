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

class sapana_prime5
{
	public static void main( String args[] )
	{
		prime  p = new prime();
		
		for( int y=1; y<=500; y++ )
		{
			boolean  x = p.findprime( y );
			
			if ( x==true )
			{
			System.out.print( y  +"    ");
			}

		}		

	}
}



