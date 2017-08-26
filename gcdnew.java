class gcdnew
{
	public static void main( String args[])
	{
		int num1=20, num2=30,gcd;

		while( num1 != num2 )
		{
			if ( num1 > num2 )
			num1 = num1 - num2;
			else
			num2 = num2 - num1;
		}

		gcd = num1 = num2;

		System.out.println( "GCD = " +gcd );			
	}
}