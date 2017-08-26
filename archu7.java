class recursion
{
	int fact( int n )
	{
		int f=1;
			
		if ( n==1 )
		return 1;
		else
		f = n * fact( n-1 );

		return f;
	}
}

class archu7
{
	public static void main( String args[] )
	{
		recursion  ob = new recursion();
		
		System.out.println( "Factorial = " + ob.fact(7)  );
	}
}