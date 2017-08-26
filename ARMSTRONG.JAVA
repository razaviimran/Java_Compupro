class ARMSTRONG 
{

public static void main( String args[])
{
	int rem, num=153;

	int orign = num;
	int newnum=0;

	while ( num > 0)
	{
		rem = num%10;
		num= num/10;
		newnum = newnum + rem * rem * rem;
	}
 
	if (orign == newnum)
	{
		System.out.println( " number is armstrong " );
	}
	else
	{
	System.out.println( " number is not armstrong " );
	}
}
}