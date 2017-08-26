class Box
{
double width;
double height;
double depth;

	Box()
	{
	width = 0;
	height = 0;
	depth = 0;
	}

	Box( double x )
	{
	width = height = depth = x;
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
}

class al44
{
public static void main(String args[])
	{
	Box mybox1 = new Box();
	Box mybox2 = new Box(5);
	Box mybox3 = new Box(2,3,4);

	double vol;
	vol = mybox1.volume();
	System.out.println("Volume is = "+vol);

	vol = mybox2.volume();
	System.out.println("Volume is = "+vol);

	vol = mybox3.volume();
	System.out.println("Volume is = "+vol);
	}

}