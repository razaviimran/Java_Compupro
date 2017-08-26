class Box
{

	double width;
	double height;
	double depth;

	Box()
	{
		System.out.println("constructing box");
		width=10;
		height=10;
		depth=10;
	}
	double volume()
	{
		return width*height*depth;
	}

}

class ppp5
{
	public static void main(String args[])
	{
	Box mybox1=new box();
	Box mybox2=new box();

	double vol;

	vol=mybox1.volume();
	System.out.println("volume is=+"vol);

	vol=mybox2.volume();
	System.out.println("volume is=+"vol);
	}
}