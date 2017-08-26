
class sorting
{
public void  ssort(String []n )
{
int i,j ;
String k ;
for( i=0; i<n.length; i++ )
	for(  j=0; j<n.length; j++ )
	{
	if( n[i].compareTo(n[j]) <0  )
	{
		k = n[i];
		n[i] = n[j];
		n[j] = k;
	}
	}

	for(  i=0; i<n.length; i++ )
	{
	System.out.print( n[i] + "  " );
	}
}
}

class ram3
{
public static void main( String args[] )
{
String[] p = { "shashi", "imran", "shrikant", "prashant", "kunwar","ali", "faizan" }; 

sorting  x = new sorting();
x.ssort( p );
			
}
}