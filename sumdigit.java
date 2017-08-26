class sapana2
{
	private int rem,org,newnum;
 
	public void sum_find( int num )
	{
		newnum=0;
		while ( num > 0)
		{
		rem = num%10;
		num= num/10;
		newnum = newnum + rem;
		}

		System.out.println( newnum ); 
	}
}

class sumdigit
{
	public static void main( String args[])
	{
		sapana2   p  = new sapana2();

		p.sum_find(153);

	}
}