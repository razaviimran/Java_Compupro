class agrawal
{
	int polin( String str )
	{
		int l,i,j;
		int flag=1;
		l = str.length();

		for( i=0, j=l-1; i<l/2; i++,j-- )
		{
			if ( str.charAt(i) != str.charAt(j)  )
			{  
				flag=0;
				break;	
			}
		}
  	
		if ( flag==1 )
		return 1;
		else
		return 0;
	}
}

class pritam8888
{
	public static void main(String args[])
	{
			agrawal  ob = new agrawal();

			int  p = ob.polin( "madam" );
		
			if ( p==1 )
			System.out.println("This is polindrome" );
			else
			System.out.println("This is NOT polindrome" );
	}
}



