class ganesh
{
	double l;
	double w;

	void area()
	{
		System.out.println( "Area of rectangle = " + (l*w) );
	}
}

class sapana4
{
	public static void main( String args[] )
	{
		ganesh   ob =  new ganesh();

		ob.l = 5;
		ob.w = 5;

		ob.area();
	}

}