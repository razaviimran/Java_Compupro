class findprime 
{
  	public int n ;
  
	public boolean find( int x )
         {
          
		boolean  v;
		v=true;
		int r;

		for( int i=2; i<x; i++ )
		{
			r = x%i;
			if ( r==0 )
			{
			v = false;			
			break;
			}

		}
		
		if ( v==true )
		return true;
		else
		return false;              
         }
} 

class prime
{
	public static void main( String args[] )
	{
			findprime   p = new findprime();

			if ( p.find( 15 ) )
			System.out.println("This is prime ");
			else
			System.out.println("This is not prime");
	}
}