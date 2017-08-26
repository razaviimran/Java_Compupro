class box
{

	double width;
	double height;
	double depth;

	Box()
	{
		System.out.println("Constructing box");
		width=10;
		height=10;
		depth=10;      
	}
	double volume()
	{
		return width*height*depth;

	}
}

	class shital
{
	public static void main(String args[])
	{
		Box mybox1=new box();
		Box mybox2=new box();

		double vol;
		vol=mybox1.volume();
		System.out.println("volume is="+vol);
		
		vol=mybox2.volume();
	}	System.out.println("volume is="+vol);
}