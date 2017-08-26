class nishu
{
	public static void main(String args[])
	{
		int i,j,k,z=4;
		i=1;
		while(i<=9)
		{
		k=1;
		while(k<=z)
		{
			System.out.print("  ");
			k++;
		}
		j=1;
		while(j<=i)
		{
		System.out.println("*");
		j++;
		}
		System.out.println();
		i=i+2;
		}
		z--;
		}
}     