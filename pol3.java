
class pol1
{
   public String x;
   public int l,i,j;
     
   public boolean find(String y)
  {
                  x=y;
                  boolean flag=true;
		
                        l = x.length();
         		i=0;
			j=l-1;
	
			while( i< l/2 )
			{		
				if ( x.charAt(i) != x.charAt(j) )	
				{
					flag = false;
					break;			
				}
			i++;
			j--;
			}
			
                      	if (flag)
			return true;
			else
			return false;
  }
    
}






class pol3
{
	public static void main( String args[] )
	{
		pol1 q = new pol1();
        	
		boolean flag = q.find( args[0]);
                
			if (  flag  )
			System.out.println( "this is polindrome");
			else
			System.out.println( "This is not polindrome");				
	}	
}



