class Box
{
	double width;
	double height;
	double depth;

	double volume()
	{
	return width * height * depth;
	}
}

class al1
{
	public static void main(String args[])
	{
		Box mybox1 = new Box();
		Box mybox2 = new Box();

		double vol;

		mybox1.width = 2;
		mybox1.height = 3;
		mybox1.depth = 4;
	
		mybox2.width = 1;
		mybox2.height = 2;
		mybox2.depth = 3;

	vol = mybox1.volume();
	System.out.println("Volume is = "+vol);

	vol = mybox2.volume();
	System.out.println("Volume is = "+vol);
	}
}