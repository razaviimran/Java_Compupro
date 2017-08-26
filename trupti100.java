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
		height = a ;
		width = b;
		depth = c;
		age = d;
	}

	void showage()
	{
		System.out.println( "Your age =  " +age );
	}

}


class trupti100
{
	public static void main( String args[] )
	{
		Box   my1 = new Box( 10,20,40 );
		Box   my2 = new Box( my1 );

		my1.show();
		my2.show();

		Boxnew  ob = new Boxnew( 1,2,3,4 );


		ob.show();
		ob.showage();

		System.out.println( my1.height );
		System.out.println( my1.width );
		System.out.println( my1.depth );


		System.out.println( ob.height );
		System.out.println( ob.width );
		System.out.println( ob.depth );

	}
}