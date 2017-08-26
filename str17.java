class str17
{
	public static void main(String args[])
	{
		char x[]={'a','b','c','d','e'};
		
		String s1=new String(x);
		String s2=new String(x,3,2);
		String s3=new String(s1);
		String s4=s1;

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}
		