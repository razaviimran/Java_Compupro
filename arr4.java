
class arr4
{
	public static void main( String args[] )
	{
		int x[] = { 11,300,100,250,170,4,40,500,400,20 };
		int i,j,z;

		for(  i=0; i<10; i++ )
		{
			for( j=i+1; j<10; j++ )
			{
				if ( x[i] > x[j] )
				{
					z = x[i];
					x[i] = x[j];
					x[j] = z; 
				}
			}	
		}

		for( i=0; i<9; i++ )
		{
			System.out.println( x[i] );
		}	

	}
}