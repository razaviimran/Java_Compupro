class polin
{
	public static void main( String args[] )
	{	
		String str = "nitin";
		int l,i,j;
		l = str.length();
		int flag = 1;

		for( i=0, j=l-1 ;   i<l/2   ;  i++, j--    )
		{
			if ( str.charAt(i) != str.charAt(j) )
			{
				flag = 0;
				break;				
			}	
		}		

		if ( flag == 1 )
		System.out.println("Polindrome" );
		else
		System.out.println("NOT Polindrome" );

	}
}