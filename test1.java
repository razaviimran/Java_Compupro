class manisha
{	
	public void findprime(int n )
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
		{		
			System.out.println("prime");
		}
		else
		{
			System.out.println("Not prime");
		}
			
	}
}

class test1
 {   
	public static void main(String args[] )             
	{
		manisha  x = new manisha();
           
		x.findprime( 25 );

	}

}