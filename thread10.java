class thread10
{
	public static void main(String args[])
	{
		Thread t=Thread.currentThread();
		
		System.out.println("Current Thread= "+t);

		t.setName("manisha");

		System. out.println("After name change= "+t);

		try
		{
			for(int n=25;n>=0;n--)
			{
				System.out.println(n);
				
				Thread.sleep(100);
			}
		}
		catch(InterruptedException j)
		{
			System.out.println("Main InterruptedException= "+j);
		}
	}
}