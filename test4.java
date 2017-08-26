
class ayub
{
	private int age;

	public ayub()
	{
		age = 0;
	}

	public ayub( int age )
	{
		this.age = age;
	}

	void showage()
	{
		System.out.println( "My age is = " +age );
	}


	void sum(  ayub  x , ayub  y )
	{
			age = x.age + y.age;
	}

}

class test4
{
	public static void main ( String args[] )
	{

		ayub  x = new ayub( 25 );
		ayub  y = new ayub( 45 );
		ayub  z = new ayub();

		// z = x+y;    not posible object addition 
		// z.age = x.age + y.age;  age is private

		z.sum( x, y );

		x.showage();
		y.showage();
		z.showage();
	}
}