class jag2 
{
	public static void main( String args[] )
	{
	int x,y;
	byte z;
	for( x=5; x>=1; x-- )
	{
	z=65;
	for( y=1; y<=x; y++ )
	{
	System.out.print( char(z) );
	z=z+2;	
	}
	System.out.println();
	
	}
		
	}
}