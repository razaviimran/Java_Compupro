class shashi
{
	private double age;

	shashi()
	{ 
	age = 0;
	}

	shashi( double a  )
	{
		age  = a;
	}
	
	void show()
	{
		System.out.println( "Age =  " +age );
	}

shashi  add(  shashi  a  , shashi  b )
	{
	shashi   tm = new shashi(); 
	tm.age  =  age  +  a.age + b.age; 
	return tm;
	}
}

class sha6
{
public static void main( String args[] )
{
	shashi  k = new shashi(  10 );
	shashi   x = new shashi( 20  );
	shashi   y = new shashi( 30 );
	shashi   z = new shashi();
	
	z  =  x.add(   y,  k  );


	x.show();
	y.show();
	k.show();
	z.show();

}
}


















