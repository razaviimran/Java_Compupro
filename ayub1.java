class imran
{
	public static void test1()
	{
	System.out.println("Test1 of imran");
	}
}

class shashi
{
	void test2()
	{
	System.out.println("Test2 of  Shashi");
	}
}

class ayub1
{
	public static void main(String args[] )
	{
	System.out.println("ayub");
	System.out.println("shashi");

	imran.test1();

	shashi   y = new shashi();
	y.test2();
 	}
}

