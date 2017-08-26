class Box
{
	double width;
	double height;
	double depth;
	
	void volume()
	{
		System.out.println("Volume="+(width*height*depth));
	
	
	}
}
class ppp3
{

	public static void main(String args[])
	{
		Box mybox1=new Box();
		
		mybox1.width=2;
		mybox1.height=3;
		mybox1.depth=4;

		mybox1.volume();
	}
}
