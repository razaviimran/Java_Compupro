
class jag4
{
public static void main( String args[] )
{
	char[] n= {'n','i','t','i','n'};
	int l= n.length;
	int i,j,flag=1;
	i=0;
	j=l-1;
System.out.println( n[3] );
	while( i< l/2 )
	{
		System.out.println(  l );
		if ( n[i] !=  n[j] )
		{
		flag=0;
		break;
		}
		i++;
		j--;
	}

	if ( flag==1 )
	System.out.println("Palindrom");
	else
	System.out.println("Not palindrom");
			
}
}