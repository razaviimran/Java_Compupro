class order
{
public int x[] = { 300, 13 , 55, 666, 20 };
public int i,j,t;
      void sorting()
      {
	for( i=0; i<5; i++ )
	{
	       for( j=i+1; j<5; j++ )
	      {
		if ( x[i] < x[j] )
		{
		  t = x[i];
		x[i] = x[j];
		x[j] = t;
		}
	      }
	}

	for(  int a=0;  a<5; a++ )
	System.out.println( x[a] );
         }
}


class mani1
{
	public static void main( String args[] )
	{
	order   x = new order();
	x.sorting();
 	}
}

