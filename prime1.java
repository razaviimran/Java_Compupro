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

class prime1
{
	public static void main( String args[] )
	{
			findprime   p = new findprime();
			
			for( int n=1; n<=500; n++ )
			{
			
				if ( p.find( n ) )
				System.out.print( n +"   " );

			}
	}	
}



