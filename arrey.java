class arrey
{ 
         public static void main(String args[])
            {
                int w[]={35,56,78,32,23,65,70,45};
                int x,y,z; 
	 for( x=0;x<8;x++)
	       {
	           for (y=x+1;y<8;y++)
	                {
		if(w[x] > w[y])
		 {	
	                    	z=w[x];
			w[x]=w[y];
			w[y]=z;
			 
		 }
	                }  
	        }
	for(x=0;x<8;x++)
	{
	System.out.println(w[x]);
	}       
	}
}