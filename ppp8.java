class n23
{
	int i,j;

	void showij()
	{
	System.out.println("i and j:"+i+" "+j);
	}
	
}
 class B extends A
{
	int k;
	void showk()
	{
		System.out.println("k:"+k);
	}
	
	void sum()
	{
		System.out.println("i+j+k:"+(i+j+k));
	}
}

class khushy2
{
	public static void main(String args[])
	{
	
	A  x=new A();
	x.i=3;
	x.j=4;
	
	x.showij();

	B  y=new B();
	y.i=30;
	y.j=40;
	y.k=100;
	
	y.showk();
	
	y.sum();
	}
}	
	