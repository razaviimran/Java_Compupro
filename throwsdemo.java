class throwsdemo
{
	static void throwOne()
	{
		System.out.println("Inside throwone.");
		throw new IllegalAccessException("demo");
	}

	public static void main(String args[])
	{
		throwOne();
	}
}