class pritam1000
{

	public static void main( String args[] )
	{
		int i,j;
		String k;
		String  x[] = { "zina", "usha" , "babita", "fatima" , "ayub" , "yatin" ,"abdul", "chitra" , "dinesh" } ;

		for( i=0; i<9; i++ )
		{
			for( j=i+1; j<9; j++ )
			{
			
				if (  x[i].compareTo(x[j]) >  0  )
				{
				
					k = x[i];
					x[i] = x[j];
					x[j] = k;	
				}	
			}
		} 

		for(  i=0; i<9; i++ )
		System.out.println( x[i] );
	}
}





