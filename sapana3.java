
class ganesh
{
	double l;
	double w;
}

class sapana3
{
	public static void main( String args[] )
	{
		ganesh   ob =  new ganesh();

		ob.l = 5;
		ob.w = 10;

		System.out.println( "Area of rectangle = " + (ob.l*ob.w) );
	}

}