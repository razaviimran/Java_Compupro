class factorial
{
	int  fact( int n )
	{
		if ( n==1 )
		return 1;
		else 
		return n*fact( n-1 );	
	}
} 

class sapana_fact1
{
	public static void main( String args[] )
	{
		factorial	p  = new factorial();
  
		int  n =  p.fact( 5 );

		System.out.println( "Factorial = "+n );		
	}
}



