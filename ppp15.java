class ppp15
{
	public static void main(String args[])
	{
	
	int x=10;y=0;z;
	
	try
	{
		z=x/y;
		System.out.println("Ans="+z);	
	
	}
	
	catch( ArithmeticException p)
	{
		System.out.println("ErrorhandlefromMe="+p);
	}
	}
}