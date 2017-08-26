class sapana
{
	private int rem,org,newnum;
 
	public boolean am_find( int num )
	{
		newnum=0;
		org = num;

		while ( num > 0)
		{
		rem = num%10;
		num= num/10;
		newnum = newnum + rem * rem * rem;
		}
 
		if (org == newnum)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class amstong 
{

	public static void main( String args[])
	{
		sapana   p  = new sapana();

		if (  p.am_find(153) )
		System.out.println( " number is  armstrong " );
		else
		System.out.println( " number is not armstrong " );
	}
}