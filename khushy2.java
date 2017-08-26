class A
{

	int i,j;
	
	void showij()
	{
		
		System.out.println("iandj:"+i+" "+j);
	}
  	
	
}

class B extends A
{

	int k;
	
	B(int l,int m,int n)
	{
	
		i=l;
		j=m;
		k=n;	
	}

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
		
			B y=new B(2,4,6);
			y.showk();
			y.sum();
			
		}
	}

