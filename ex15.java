class ex15
{
	static void throwOne() throws IllegalAccessException
	{
		System.out.println("Inside throwone.");
		throw new IllegalAccessException("demo");
	}

	public static void main(String args[])
	{
		try
		{
			throwOne();
		}
		catch( IllegalAccessException  ex )
		{
			System.out.println( ex );
		}	
	}
}