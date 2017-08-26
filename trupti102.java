class Box
{
	double height,width,depth;

	Box()
	{
		height = width = depth =0;
	}

	Box( Box ob)
	{
		height = ob.height;
		width = ob.width;
		depth = ob.depth; 
	}
	
	Box( double h, double w, double d )
	{
		height = h;
		width = w;
		depth = d; 
	}

	void show()
	{
		System.out.println( "Volume =  " +(height*width*depth)  );
	}	
}

class Boxnew extends Box	
{
	double  age;

	Boxnew( double a, double b, double c, double  d )
	{
		super.height = a;
		super.width = b;
		super.depth = c;
		age = d;
	}

	void showage()
	{
		System.out.println( "Your age =  " +age );
	}

}


class trupti102
{
	public static void main( String args[] )
	{
		

		Boxnew  ob = new Boxnew( 1,2,3,4 );


		System.out.println( ob.height );
		System.out.println( ob.width );
		System.out.println( ob.depth );


	}
}