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

	void add(  shashi  a , shashi b )
	{
	age = a.age + b.age; 
	}
}

class sha5
{
public static void main( String args[] )
{
	shashi   x = new shashi( 3 );
	shashi   y = new shashi( 2 );
	shashi   z = new shashi();
	
	z.add(  x, y );

	x.show();
	y.show();
	z.show();
}
}
