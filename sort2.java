class sort2
{

static String xx[] = { "ayub","fatima","disha","abdul", "babi", "seema" , "Taufiq" };

public static void main( String args[] )
{
int i,j;

 
            for(  i=0; i<xx.length; i++)
              {  

                for( j=i+1;j<xx.length;j++)
                {   
		  	if (  xx[i].compareTo(xx[j]) >0 ) 
	 	    	{
                   		String t=xx[i];
                          	xx[i]=xx[j]
                          	xx[j]=t;      
		        }
                }
              }
	

	System.out.println( "\n\nAfter sorting");
	for( int a=0; a<xx.length; a++ )
	{
		System.out.println( xx[a] );
	}

}
}