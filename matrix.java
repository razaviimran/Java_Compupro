class matrix
{
    public static void main(String args[])
   {
      int mat[][]=new int[3][3];
      int i,j,k,m=0; 
       for (i=0;i<3;i++)   
          for (j=0;j<3;j++)
             
             {
              mat[i][j]=m;
              m++; 
             }

       for (i=0;i<3;i++)
	{
          for (j=0;j<3;j++)
            { 
              System.out.print(  "   " +mat[i][j]);
            }
	  System.out.println( );  
       }
   }
}