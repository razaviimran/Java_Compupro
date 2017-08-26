class manisha
{	
	public int  findprime(int n )
	{
		int i,r,flag=1;

		for( i=2; i<n; i++ )
		{
			r = n%i;
			if ( r==0 )
			{
				flag = 0;
				break;
			}	
		}
		
		if ( flag==1 )
		return 1;
		else
		return 0;
	}
}

class test2
 {   
	public static void main(String args[] )             
	{
		manisha  x = new manisha();	
		int p;

		for( int m=1; m<=1000; m++ )
		{
			 p = x.findprime( m );

			if ( p==1 )
			System.out.print( m +"  " );

		}		

	}

}