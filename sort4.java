
class sort4
{
       static String arr[]={ "now","is","time","for","all","good","men","to","come"};
	public static void main( String args[] )
	{
		int i,j;
         for(j=0;j<arr.length;j++)
          {
            for(i=j+1;i<arr.length;i++)
             {
               if(arr[i].compareTo(arr[j])<0)
                {
                  String t=arr[j];
                   arr[j]=arr[i];
                    arr[i]=t;
                }
       
             }
          }

		for( int a=0; a<arr.length; a++ )
		{
			System.out.println(arr[a]); 
		}

	}
}