
class rahul
{

    double a;
    double b;

    rahul( double p, double q )
    {
         a = p;

         b = q;

    }

    boolean test( rahul x )
    {

         if ( a==x.a && b == x.b )
         return true;
         else
         return false;

    }

}

class ay4
{

  public static void main(String args[] )
  {

      rahul r1 = new rahul(10,20);
      rahul r2 = new rahul(10,20);
      rahul r3 = new rahul(1,2);


      System.out.println( r1.test(r2) );

      System.out.println( r1.test(r3) );
  }



}

