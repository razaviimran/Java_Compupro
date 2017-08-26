class pp1
{
	
	public static void main(String args[])
	{
		int x=10,y=5,z;
		int a[]=new int[4];

		try
		{

		a[8]=100;
		z=x/y;
		System.out.println("Ans="+a[8]);
		System.out.println("Ans="+z);
		}
		
	
	
	
	catch(ArrayindexoutofBoundsexception p)
	{
		System.out.println("Error handle from Me="+p);
	}
	
	catch(ArithmeticException p)
	{
		System.out.println("Error handle from Me="+p);	
	}
	
	}
}	