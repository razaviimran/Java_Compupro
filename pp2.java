class ppp21
{	
	public static void main(String args[])
	{
	
		int x=10,y=0,z;
		
		int a[]=new int[4];

		try
		{
	
			a[9]=100;
			Sytem.out.println("Ans= "+a[9]);	
		}
	
		catch(ArrayindexOutOfBoundsException p)
		{
	
			System.out.println("Error handle from Me="+p);
		}
	
	}	
	
}