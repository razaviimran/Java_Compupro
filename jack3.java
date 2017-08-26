class amar
{
	int x,y;

	amar( int a, int b )
	{
		x = a;
		y = b;
		System.out.println("Hi amar");
	}

	 void  add()
	{	
		
		System.out.println(  (x+y)  );
	}
}

class jack3
{

	public static void main( String args[] )
	{
		amar  ob1 = new amar(10,20);
		amar  ob2 = new amar(50,70);
		
		ob1.add();
		ob2.add();

	}
}
