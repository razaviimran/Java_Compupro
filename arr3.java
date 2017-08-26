class arr3
{
public static void main( String args[] )
{
String x[] = { "zubari", "sonali", "lavita", "jack", "mahid" ,"babu" , "chitra" , "dinesh" , "umesh" };
		
		int  i , j ;
		String z;

		for ( i=0; i<9; i++)
		{
		     for (j=i+1; j<9; j++)
		      {
			if(     x[i].compareTo( x[j] ) >0   )
              			{
				z=x[i];
				x[i]=x[j];
				x[j]=z;

			}
		    }
		}

	for ( i=0; i<9 ; i++)
                 {
  		System.out.println(x[i]);
	 }
       }
}
