class A
{
	int i,j;
	A( int p, int q )
	{
		i = p;
		j = q; 
	}
 
	void showij()
	{
		  System.out.println("i and j : " + i + " " +j );
	}
}
 
class B extends A
{
	int k;

	B( int l, int m, int n)
	{
		super( l , m );
		k = n;
	}

 	void showk()
	{
		System.out.println("k: " + k);
	}

	void sum()
	{
	 System.out.println( " i+j+k: " +  (i+j+k) );
	}
}

class sheetal103
{ 
	public static void main(String args[])
	{	
		B y = new B( 10, 20 ,30 );
				
		y.showk();
		y.sum();
	}
}
