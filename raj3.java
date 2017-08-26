class prime
{
	public int findprime( int n )
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
	return 0;
	else
	return 1;
	}
}

class raj3
{
	public static void main(String args[] )
	{
	      prime   x = new prime();

	for( int n=1; n<=1000; n++ )	
      	      if ( x.findprime( n )  ==1 )
		System.out.print( n +"  ");

	}
}