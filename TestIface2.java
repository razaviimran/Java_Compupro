class TestIface2
{
	public static void main(String args[])
	{

                Callback c = new Client();
                c.callback(42);

                Client1 ob = new Client1();


                c = ob;   // c now refers to AnotherClient object

                c.callback(42);
	}
}

