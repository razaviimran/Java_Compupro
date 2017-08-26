class sum
{
	public static void main( String args[] )
	{
		int x, t=0;


		for( x=0; x<args.length; x++ )
		{
			t =  t +  Integer.parseInt(args[x]);
		}		
		
		System.out.println( "Total = " +t );

	}

}