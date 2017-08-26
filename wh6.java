class wh6
{
	public static void main(String args[] )
	{

		int x,y,a,b=4;
		 y=1; 

		while( y<=9 )
		{

			for( a=1; a<=b; a++ )
			{
			System.out.print(" ");
			}

		
			x=1;
			while ( x<=y  )
			{
			     System.out.print( "*" );
			x++;
			}
			System.out.println();


		y=y+2;
		b--;
		}
		
	}
}

