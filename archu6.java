// returning objects
class trupti
{
	private int age;

	trupti()
	{
		age=0;
	}

	trupti( int a )
	{
		age=a;
	}

	void showage()
	{
		System.out.println( "Your age is = "  +age );
	}

	trupti  tot(  trupti  p )
	{
		trupti  tm;
		tm.age = age + p.age; 
		return tm;
	}
}

class archu6
{
	public static void main( String args[] )
	{
		trupti  x = new trupti(10);
		trupti  y = new trupti(20);
		trupti  z = new trupti();
		
		z = x.tot(  y  );

		x.showage();
		y.showage();
		z.showage();
	}
}