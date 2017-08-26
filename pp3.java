class pp3
{	
	public static void main(String args[])
	{
	
		int x=10,y=0,z;
		
		int a[]=new int[4];

		try
		{
	
			a[7]=100;
			Sytem.out.println("Ans= "+a[7]);	
		}
	
		catch(ArrayindexOutOfBoundsException p)
		{
	
			System.out.println("Error handle from Me="+p);
		}
	
	}	
	
}