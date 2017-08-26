final class archana
{
	void show1()
	{
		System.out.println( "This is show function of archana class");
	}
}

class trupti extends archana
{
	void show2()
	{
		System.out.println( "This is show function of trupti class");
	}
}


class fin2
{

	public static void main( String args[] )
	{

		trupti  t = new trupti();

		t.show1();
		t.show2();

	}
}