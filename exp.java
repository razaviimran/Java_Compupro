class exp
{
	public static void main(String args[])
	{
		int a=34,b=30,c;
	try 
	{
		c=a*b;
		System.out.println("c="+c);
	}
	catch(ArithmeticException e )
		{
		 System.out.println(" call to your repairman"+e);
		}
	}
}