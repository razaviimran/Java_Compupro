class Box
{
	double width;
	double height;
	double depth;
	
	double volume()
	{	
	return width*height*depth;	
	}	
	
	void setdim (double w,double h,double d)
	{
		width=w;
		height=h;
		depth=d;
	}

class ppp7
{

	public static void main (String args[])
	{

	Box mybox1=new Box();
	Box mybox2=new Box();
	
	double vol;
		
	mybox1.setdim(10,20,15);
	mybox2.setdim(2,3,4);

	vol=mybox1.volume();
	System.out.println("volume is="+vol);

	vol=mybox2.volume();
	System.out.println("volume is="+vol);
                   }
}
	
 