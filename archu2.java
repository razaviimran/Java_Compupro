
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

	void  tot(  trupti  p, trupti  k )
	{
		age = p.age + k.age; 
	}

}

class archu2
{
	public static void main( String args[] )
	{
		trupti  x = new trupti(10);
		trupti  y = new trupti(20);
		trupti  z = new trupti();
		
		z.tot( x,y );

		x.showage();
		y.showage();
		z.showage();
	}
}