abstract class A
{
        	abstract void callme( );
}

class B extends A
{
	void callme( )
	{
		System.out.println("B' s implementation of callme.");
	}
}

class file2
{
	public static void main(String args[] ) 
	{
		B b = new B ();
	
		b.callme( ) ;

		
	}
}
