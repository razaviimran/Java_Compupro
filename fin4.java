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
		System.out.println( "This is show function of trupti class");
	}
}

class ayub extends archana
{
	void show()
	{
		System.out.println( "This is show function of ayub class");
	}
}

class fin4
{
	public static void main( String args[] )
	{
		archana a = new archana();
		trupti      b = new trupti();
		ayub       c = new ayub();

		archana  r;  

		r = b;
		r.show();

		r = c;
		r.show();
	}
}