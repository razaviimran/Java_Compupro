class aimt8
{
public static void main (String args[])
{

        String x[] = { "Aish", "rani", "katrina", "zeba",  "amisha", "pooja" , "prinkya" };
        String z;	
        int i,j;

	
	
	for( i=0; i<7; i++ )
	{
	
		for( j=i+1; j<7; j++ )
		{
			
			if (  x[i].compareTo(x[j])  >0  )
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