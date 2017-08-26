final class pritam
{	
	public void test1()
	{
		System.out.println("test of pritam");
	}
}

class sheetal extends pritam
{
	public void test2()
	{
		System.out.println("test of sheetal");
	}
}

class final103
{
	public static void main( String args[] )
	{
		sheetal ob = new sheetal();

		ob.test1();
		ob.test2();
	}
}