class ganesh
{
	double l;
	double w;

	double area()
	{
		return (l*w);
	}
}

class sapana6
{
	public static void main( String args[] )
	{
		ganesh   ob1 =  new ganesh();
		ganesh   ob2 =  new ganesh();
		ganesh   ob3 =  new ganesh();

		ob1.l = 1;
		ob1.w = 1;

		ob2.l = 2;
		ob2.w = 2;

		ob3.l = 3;
		ob3.w = 3;

		System.out.println( "Area = " + ob1.area() );
		System.out.println( "Area = " + ob2.area() );
		System.out.println( "Area = " + ob3.area() );
	}
}