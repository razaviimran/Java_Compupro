class aimt7
{
public static void main (String args[])
{

	int x[] = { 100, 500, 34, 7, 40 , 600, 18  };
	int i,j,z;

	
	for( i=0; i<7; i++ )
	{
	
		for( j=i+1; j<7; j++ )
		{
			
			if (  x[i] > x[j] )
			{
				z = x[i];
				x[i] = x[j];
				x[j] = z;
			} 
		}
		
	}


	for(  i=0; i<7; i++ )
	{
		System.out.println( x[i] );
	}





	
}
}