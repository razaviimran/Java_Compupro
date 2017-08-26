//object as a parameter

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

	void test( Box   k )
	{
		width = k.width;
		height = k.height;
		depth = k.depth;
	}

}

class al7
{
public static void main(String args[])
	{
	Box mybox1 = new Box(10,20,15);
	Box mybox2 = new Box();

	double vol;
	vol = mybox1.volume();
	System.out.println("Volume is = "+vol);

	mybox2.test( mybox1 );

	vol = mybox2.volume();
	System.out.println("Volume is = "+vol);
	}

}