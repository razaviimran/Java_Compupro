 abstract class somya implements mani
{	public void lilesh()
	{
		System.out.println("Hi lilesh");
	}

	//public void ram(){};
	//public void sham(){};
	
}
class ayub implements mani
{
	public void ram()
	{
		System.out.println("Hi ram");
	}
	public void sham()
	{
		System.out.println("Hi sham");

	}
	public void lilesh(){};
}
class raju
{
	public static void main(String args[])
	{
		mani m=new ayub();
		somya n=new somya();

		n.lilesh();
		m.ram();
		m.sham();
	}
	
}