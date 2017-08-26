class trupti
{
	boolean palin( String s )
	{
		int i,j,l = s.length();
		int flag = 1;
		
		for(  i=0, j=l-1     ;  i<l/2     ;   i++, j--      )
		{
			if ( s.charAt(i) != s.charAt(j)  )
			{
				flag = 0;
				break;
			}
		}	

		if ( flag==1 )
		return true;
		else
		return false;
	}
}

class exam2002
{
	public static void main( String args[] )
	{
		trupti   b = new trupti();

		if (  b.palin("nitin")  )
		System.out.println( "This is palindrome");
		else
		System.out.println( "This is NOT palindrome");

	}
}






