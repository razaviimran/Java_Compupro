

class raj1
{
	public static void main(String args[] )
	{
	System.out.println( args.length );

	if ( args.length == 0 )
	System.out.println( "no parameter" );
	else
	System.out.println( "Total parameter = " +args.length ); 

	for( int i=0;  i<args.length; i++ )
	{
	System.out.println( args[i] );
	}
	
	}
}