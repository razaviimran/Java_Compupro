class calculate
{
	public int a,b;
	void setval( int x, int y )
	{
		a = x;
		b = y;
	}
	public void add()
	{
		System.out.println("Ans = " +(a+b)  ); 
	}
	public void sub()
	{
		System.out.println("Ans = " +(a-b)  ); 
	}
	public void mul()
	{
		System.out.println("Ans = " +(a*b)  ); 
	}
	public void div()
	{
		System.out.println("Ans = " +(a/b)  ); 
	}
}
class test1003
{
	public static void main( String args[] )
	{
		calculate c = new calculate();
		c.setval(30,10);
		c.add();	
		c.sub();	
		c.mul();	
		c.div();
	}
}
