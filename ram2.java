class prime
{
public int i, r,flag;
	
public boolean find_prime( int n )
{
	flag=1;
	for( i=2; i<n; i++ )
	{
		r = n%i;
		if ( r==0 )
		{
		flag=0;
		break;
		}	
	}


	if ( flag==0 )
	return false;
	else
	return true;
}

}

class ram2
{
public static void main( String args[] )
{
	prime  ob = new prime();
	
for( int n=1; n<=1000; n++ )
	if ( ob.find_prime(n)  )
	System.out.print( n + "  " );
//	else
//	System.out.println("Nprime");
		
}
}
