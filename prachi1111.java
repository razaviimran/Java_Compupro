class trangle extends rectangle
{

     trangle()
     {
          length=0;
          width=0;
     }


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


class myclass extends trangle
{



}



class prachi1111
{


   public static void main( String args[] )
   {

        double a;

        myclass mm = new myclass();

        mm.length=200;
        mm.width=300;

        a = mm.area();

        System.out.println("Total area : " +a );

   }

}

