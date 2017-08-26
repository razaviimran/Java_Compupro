class A
{
	public void mani()
	{
		System.out.println("Hi i'm  mani from A class ");
	}
}

class B extends A
{
                public void mani()
	{
		System.out.println("Hi i'm mani from B class");
	}
}
class ayub
{
	public static void main(String args[])
	{
		B ob=new B();
		ob.mani();
	}
}	