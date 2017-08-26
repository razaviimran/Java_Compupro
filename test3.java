
class ayub
{
	public int age;

	public ayub()
	{
		age = 0;
	}

	public ayub( int aa )
	{
		age = aa;
	}

	void showage()
	{
		System.out.println( "My age is = " +age );
	}

}

class test3
{
	public static void main ( String args[] )
	{

		ayub  x = new ayub( 20 );
		ayub  y = new ayub( 40 );
		ayub  z = new ayub();

		z.age = x.age + y.age;

		x.showage();
		y.showage();
		z.showage();
	}
}