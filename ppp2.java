class ppp2
{
public static void main(String args[])
{
	int i,j,k,z=4;
	for (i=1;i<=9;i=i+2)
	{
		for(k=1; k<=z; k++)
		{
			System.out.print("  ");
		}
		for(j=1;j<=i;j++)
		{
			System.out.print("*");	
		}

                            System.out.println();
	z--;
	}         

}
}