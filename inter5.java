class inter5 implements Callback
{

	public void callback( int p)
	{
	System.out.println("Callback called with " + (p*p) );
	}

	void nonIfaceMeth()
	{
	System.out.println("Classes that implement interface "+" may also define other members,too.");
	}
}

