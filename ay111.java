
class rectangle
{

    double length;
    double width;

    rectangle(int a, int b )
    {
         length=a;
         width=b;
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

class ay111
{


   public static void main( String args[] )
   {

        double a;

        rectangle r = new rectangle(3,4);


        a = r.area();

        System.out.println("Total area : " +a );

   }

}

