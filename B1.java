class A
{
	int x;
	void div(int x)
	{
	this.x=x;
	if(x%4==0||x%6==0)
	System.out.println("Divisible by 4 or 6 either both=");
	else
	System.out.println("Divisibal by 4 or 6 but not both=");
	}
	void dis()
	{
	System.out.println("x="+x);
	}
}
clas B1
{
	public static void main(String args[])
	{
	
	A a=new a();
	a.div(12);
	a.dis();

	A b=new b();
	b.div(16);
	b.dis();
	}
}