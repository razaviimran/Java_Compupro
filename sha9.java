class shashi
{
	public shashi()
	{
	System.out.println( "constructor  of  shashi" );
	}
}

class imran  extends shashi
{
	public imran()
	{
	System.out.println( "constructor  of  imran" );
	}
}

class ram extends imran
{
	public ram()
	{
	System.out.println( "constructor  of  ram" );
	}
}

class sha9
{
public static void main( String args[] )
{
	ram   s  = new  ram();
}
}