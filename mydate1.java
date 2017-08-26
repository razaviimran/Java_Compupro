class date
{
	public int age;
	
	public void showage()
	{
		System.out.println("Your age is = " +age );
	}
}

class mydate1
{
	public static void main( String args[] )
	{

		date  a = new date();
		date  b = new date();
		date  c = new date();

		a.age = 20;
		b.age = 30;
		c.age  = a.age + b.age;

		a.showage();
		b.showage();
		c.showage();
	}
}