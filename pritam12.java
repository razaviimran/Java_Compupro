
class pritam12
{
	public static void main(String args[])
	{
	int i,j,temp;                      
	int  x[]  ={ 11, 22, 44, 15, 600, 7, 8 };
		
		for( i=0;  i<x.length; i++ )
		{
			for( j=i+1; j<x.length;  j++ )
			{
	                                          	if(  x[i]  >  x[j]  )
                                          		{
                                                                                temp=x[i];
                                          			x[i]=x[j];
                                             			x[j]=temp;
                                          		}
                                        	}
		}		   			   


		for( i=0;  i<x.length; i++ )
		{
			System.out.println( x[i] );
		}		   			   



	}
}



