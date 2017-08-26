class calculate
{
	public int a,b;

	public void setval(int x, int y)
	{
		a = x;
		b = y;
	}

	public void add()
	{
		System.out.println("Ans = " +(a+b)  ); 
	}
}

class test1002
{
	public static void main( String args[] )
	{
		calculate c = new calculate();	
		c.setval(10,20);
		c.add();	
	}
}
