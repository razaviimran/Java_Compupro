class pritam1
{

	public static void main( String args[] )
	{
		int i,j,k;
		int x[] = { 12, 345, 35, 1000, 3, 900, 17 } ;

		for( i=0; i<7; i++ )
		{
			for( j=i+1; j<7; j++ )
			{
			
				if ( x[i] > x[j] )
				{
				
					k = x[i];
					x[i] = x[j];
					x[j] = k;	
				}	
			}
		} 

		for(  i=0; i<7; i++ )
		System.out.println( x[i] );
	}
}



