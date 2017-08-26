class sort1
{
	public static void main( String args[] )
	{
		int x[] = { 33, 55, 1, 600, 789, 230,24, 100 };

		int l,i,j,temp;
               		
		l = x.length;

			
		for( i=0; i<l ; i++ )
		{
			
			for( j=i+1; j<l; j++ )
			{
	
                       		if ( x[i] < x[j] )
				{
					temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}

			}
		}	 
     

		for( i=0; i<l ; i++ )
		{
			System.out.println( x[i] );
		}

	}	
}



