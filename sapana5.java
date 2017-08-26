class ganesh
{
	double l;
	double w;

	double area()
	{
		return (l*w);
	}
}

class sapana5
{
	public static void main( String args[] )
	{
		ganesh   ob =  new ganesh();

		ob.l = 5;
		ob.w = 5;

		double a = ob.area();
		System.out.println( "Area = " +a );

	}

}