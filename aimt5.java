class aimt5
{
public static void main (String args[])
{
int x,y,a,b=4;

	y=1;
	while(y<=9)
	{
		a=1;
		while( a<=b )
		{
			System.out.print(" ");
			a++;
		}

		x=1;
		while (x<=y)
		{
			System.out.print("*");
			x++;
		}
		System.out.println(" ");
	y=y+2;
	b--;
	}
}
}