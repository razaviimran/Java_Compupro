class A
{

	int i,j;
	 void show ij()
	{
		System.out.println("i and j: +i+" "+j);
	
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
class khushy1
{
public static void main(String args[])
{

	A superob=new A();
	B superob=new B();

	superob.i=10;
	superob.j=20;

	System.out.println("Contents of superob:");

	superob.show ij();
	System.out.println();

	subob.i=7;
	subob.j=8;
	subob.k=9;
	
	System.out.println("Contents of subob:");
	subob.show ij();
	subob.show k();
	
	System.out.println("sum of i,jandk in subob:");
	
	subob.sum();
}
}
	