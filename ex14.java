class ex14
{
	static void shashi()
	{
		throw new NullPointerException("Demo");
	}

	public static void main(String args[])
	{
		try
		{
			shashi();
		}
		catch(NullPointerException e)
		{
			System.out.println("Shashi caught: "+e);	
		}
	}
}