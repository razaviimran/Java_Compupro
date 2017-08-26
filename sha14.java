class shashi
{
	public  void start()
	{
	System.out.println( "Hiiiiiiiiiiiiiii start of shashi");
	}
}

class imran extends shashi
{
	public  void start()
	{
	System.out.println( "Hiiiiiiiiiiiiiii start of  Imran");
	}
}

class sha14
{
public static void main( String args[] )
{
	shashi   x = new shashi();
	x.start();
	imran o= new imran();
	o.start();
}
}