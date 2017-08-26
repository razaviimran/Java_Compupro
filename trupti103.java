// method overriding 

class archana
{
	void show()
	{
		System.out.println( "This is show function of archana class");
	}
}

class trupti extends archana
{
	void show()
	{
		super.show();
		System.out.println( "This is show function of trupti class");
	}
}


class trupti103
{

	public static void main( String args[] )
	{

		trupti  t = new trupti();

		t.show();
	}
}