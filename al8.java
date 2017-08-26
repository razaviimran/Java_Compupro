// return as object

class Box
{
double width;
double height;
double depth;

Box(){
	width = 0;
	height = 0;
	depth = 0;
         }

Box( double w, double h, double d )
	{
	width = w;
	height = h;
	depth = d;
	}

double volume()
	{
	         return width * height * depth;
	}

Box   test( double a, double b , double c)
	{
	      Box ob = new Box();	
		ob.width  = a;
		ob.height  = b;
		ob.depth  = c;

	return ob;	
	}

}

class al8
{
public static void main(String args[])
	{
	Box mybox1 = new Box(10,20,15);
	Box mybox2 = new Box();

	double vol;
	vol = mybox1.volume();
	System.out.println("Volume is = "+vol);

	mybox2 = mybox1.test( 2,3,4 );

	vol = mybox2.volume();
	System.out.println("Volume is = "+vol);
	}
}