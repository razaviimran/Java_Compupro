//object as a parameter

class Box
{
	double age;

	Box()
	{
	   age = 0;
	}

	Box( double a )
	{
	   age = a;
	}
}

class al9
{
public static void main(String args[])
	{
		Box mybox1 = new Box(10);
		Box mybox2 = new Box(20);		
		Box mybox3 = new Box();

		mybox3.age = mybox1.age + mybox2.age;

		System.out.println("age is = "+mybox1.age);
		System.out.println("age is = "+mybox2.age);
		System.out.println("age is = "+mybox3.age);
	}
}