class pol1
{
	public static void main( String args[] )
	{
			String x = "abccba";
			int l,i,j;
			boolean flag=true;
		
			l = x.length();
			i=0;
			j=l-1;
	
			while( i< l/2 )
			{		
				if ( x.charAt(i) != x.charAt(j) )	
				{
					flag = false;
					break;			
				}
			i++;
			j--;
			}
			

			if (  flag  )
			System.out.println( "this is polindrome");
			else
			System.out.println( "This is not polindrome");			
	}	
}



