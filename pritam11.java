
class pritam11
{
	public static void main(String args[])
	{
	int i,j;                      
                   String temp;

String str[]  ={ "sheetal" , "pritam" , "babu" , "akanksha" ,  "abdul",  "ravi" , "ayub" , "zubar" , "dinesh" };
		
		for( i=0;  i<str.length; i++ )
		{
			for( j=i+1; j<str.length;  j++ )
			{
	                                          	if(  str[i].compareTo(str[j]) > 0  )
                                          		{
                                                                            	temp=str[i];
                                          			str[i]=str[j];
                                             			str[j]=temp;
                                          		}
                                        	}
		}		   			   


		for( i=0;  i<str.length; i++ )
		{
			System.out.println( str[i] );
		}		   			   



	}
}



