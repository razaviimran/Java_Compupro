abstract class vehicle
{
	public  abstract void start();
	public  abstract void stop();
}

class bike extends  vehicle
{
	public void start()
	{
	System.out.println( "Start bike with kick" );
	}
	public void stop()
	{
	System.out.println( "Stop bike with hand break" );
	}
}

class car extends  vehicle
{
	public void start()
	{
	System.out.println( "Start Car with key" );	
	}

	public void stop()
	{
	System.out.println( "Stop Car with breaks" );
	}

}

class sha11
{
public static void main( String args[] )
{
	bike   b = new bike();
	car   c = new car();

	c.start();
	c.stop();
	b.start();
	b.stop();

}
}