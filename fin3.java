class archana
{
	final void show()
	{
		System.out.println( "This is show function of archana class");
	}
}

class trupti extends archana
{
	void show()
	{
		System.out.println( "This is show function of trupti class");
	}
}


class fin3
{

	public static void main( String args[] )
	{

		trupti  t = new trupti();

		t.show();

	}
}