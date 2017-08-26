class ganesh
{
	void area( )
	{
		System.out.println( "area function of ganesh class");	
	}

}

class ayub extends ganesh
{
	void area1( )
	{
		System.out.println( "area1 function of ayub class");	
	}
}

class sapana9
{
	public static void main( String args[] )
	{
		ayub   a =  new ayub();	
		
		a.area();
		a.area1();

	}
}