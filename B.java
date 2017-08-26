class A
{
	int x;
	void div(int x)
	{
	thisx=x;
	if(x%4==0||x%6==0)
	System.out.println("Divisible by either4 or 6=")';
	else
	System.out.println("Divisible by einther 4 or 6 but not both=");
	}
	void dis()
	{
		System.out.println("x="+x);
	}
}
class B
{
	public static void main(String args[])
	{
	A a=new A();
	a.div(4);
	a.dis();

	A b=new A();
	b.div(6);
	b.dis();
	}
}