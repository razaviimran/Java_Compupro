
class rectangle
{

    public double length;
    public double width;

    rectangle()
    {
         length=0;
         width=0;
         System.out.println("Hi i am initializing variable");
    }


    public double area()
    {
        return length*width;
    }


    protected void finalize()
    {

         System.out.println("Thanks u r using object");
    }

}

class ay1
{


   public static void main( String args[] )
   {

        double a;

        rectangle r = new rectangle();

        r.length = 10;
        r.width  = 5;

        a = r.area();

        System.out.println("Total area : " +a );

   }

}

