class pritam
{	
	public final void test()
	{
		System.out.println("test of pritam");
	}
}

class sheetal extends pritam
{
	public void test()
	{
		System.out.println("test of sheetal");
	}
}

class final101
{
	public static void main( String args[] )
	{
		sheetal ob = new sheetal();

		ob.test();
	}
}