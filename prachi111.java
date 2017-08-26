class trangle extends rectangle
{


     trangle(int x, int y)
     {
           length=x;
           width =y;
     }

     public double tarea()
     {
         return 0.5*length*width;
     }
    
}




class prachi111
{


   public static void main( String args[] )
   {

        double a;

        trangle t = new trangle( 3,11 );


        a = t.tarea();

        System.out.println("Total area : " +a );

   }

}

