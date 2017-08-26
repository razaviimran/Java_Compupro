class A
{
	A()
	{
		  System.out.println("Constructor of A class " );
	}
}
 
class B extends A
{
	B()
	{
		  System.out.println("Constructor of B class " );
	}
}

class C extends B
{
	C()
	{
		  System.out.println("Constructor of C class " );
	}
}

class sheetal104
{ 
	public static void main(String args[])
	{	
		C  y = new C();
	}
}
