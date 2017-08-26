abstract class vehicle
{
	abstract void start();
	abstract void stop();
}

class bike extends vehicle
{
	void start()
	{
		System.out.println( "start bike with kick");
	}

	void stop()
	{
		System.out.println( "Stop car with hand break");
	}
}

class car extends vehicle
{
	void start()
	{
		System.out.println( "start car with key");
	}

	void stop()
	{
		System.out.println( "Stop car with leg break");
	}
}



class fin6
{
	public static void main( String args[] )
	{
		vehicle v;
		bike      b = new bike();
		car        c = new car();

		v = c;  
		v.start();
		v.stop();
	}
}