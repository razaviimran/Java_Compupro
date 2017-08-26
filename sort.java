class sort
{

public static void main( String args[] )
{
	String x[] = { "pranali" , "rohini" , "josna" , "ruchi" , "aisha", "mayuri", "zeena" , "beena" };

		int i,j;
		String temp;		

	
		for( i=0; i<8 ; i++ )
		{

			for( j=i+1; j<8; j++ )
			{

		                if ( x[i].compareTo( x[j] ) >0  )
				{
					temp = x[i];
					x[i] = x[j];		
					x[j] = temp;
				}
			}
		}	 
     

		for( i=0; i<8 ; i++ )
		{
			System.out.println( x[i] );
		}

	}	
}



