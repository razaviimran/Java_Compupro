class ganesh
{
	void area( )
	{
		System.out.println( "area function of ganesh class");	
	}

}

class ayub extends ganesh
{
	void area( )
	{
		System.out.println( "area function of ayub class");	
	}
}

class sapana10
{
	public static void main( String args[] )
	{
		ayub   a =  new ayub();	
		
		a.area();

	}
}