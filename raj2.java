class prime
{
	public void findprime( int n )
	{
		int r, i, x=1;
		for( i=2; i<n; i++ )
		{
		r = n%i;
		 	if ( r==0 )
			{
			x = 0;
			break;	
			}			
		}

	 if( x==0 )
	System.out.println("not prime");
	else
	System.out.println("This is prime");
	}
}

class raj2
{
	public static void main(String args[] )
	{
	      prime   x = new prime();

      	      x.findprime( 25 );
	}
}