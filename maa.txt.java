class lilesh
{
           public static void  main(String args[])
           {
                      int x,r,t=0;
	      
	     
	      BufferedReader x=new BufferedReader(newInputStreamReader(System.in));
                      String str;      	     
	      
	        System.out.println("Enter number= ");	    		
                         
                        While(x!=0)
                         {
                                     r=x%10;
		     t=t*10+r;
		     x=x/10;
	          }
	            System.out.println("Reverse number= " +t);
	}
}	          	     