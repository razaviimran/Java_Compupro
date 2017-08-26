class ganesh
{
	void area( )
	{
		System.out.println( "zero argument area function");	
	}

	void area( int x )
	{
		System.out.println( "one argument area function");	
	}

	void area( int x, int y )
	{
		System.out.println( "two argument area function");	
	}
}

class sapana8
{
	public static void main( String args[] )
	{
		ganesh   ob1 =  new ganesh();	

		ob1.area();
		ob1.area(10);
		ob1.area(20,40);

	}
}