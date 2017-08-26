class factorial
{
	void fact( int n )
	{
		int f = 1;
 
		for( int i=1; i<=n; i++ )
		{
			f = f*i;		
		}

		System.out.println("Factorial of number =  " +f );
	
	}

} 


class sapana_fact
{
	public static void main( String args[] )
	{
		factorial	p  = new factorial();
  
		p.fact( 4 );		
	}
}



