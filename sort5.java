class sort5
{
 public static void main (String args[])
 {
    int x[]={22,44,11,55,33,77,66};
    int l = x.length;
     
     for(int i=0; i<l; i++)
     {

         for(int j=i+1; j<l; j++)
          {
             System.out.println("ayub = "+ x[i] + "  ani =  " +x[j] );
          }

	  System.out.println("");	      
     } 
    
 }
}