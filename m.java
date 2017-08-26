class manisha
{
	public void findamstrong(int n)
	{
		int n1,n,s=0,r;
		n1=n;
		while(n!=0)
		{
			r=n%10;
			s=r+s*s*s;
			n=n/10;
		}
		if(n1==s)
		{
			System.out.println("Amtrong number");
		}
		else
		{
			System.out.println("Not amtrong number");
		}
	}
}

class pol
{
	public static void main(String args[])
	{
		manisha x=new manisha();
		x.manisha(234);
	}
}
			
	
