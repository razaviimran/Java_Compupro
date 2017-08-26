class shashi
{
	void test1()
	{
		System.out.println( "Test1 of  shashi" );
	}
}

class imran extends shashi
{
	void test2()
	{
		System.out.println( "Test2 of  imran" );
	}
}

class ram extends imran
{
	void test3()
	{
		System.out.println( "Test3 of  ram" );
	}
}

class sha7
{
public static void main( String args[] )
{
	ram   s  = new  ram();
	s.test1();
	s.test2();
	s.test3();

}
}