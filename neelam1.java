class madhuri

{
      public int age;

      madhuri ()
    {
         age=0;

    }
                     
      madhuri (int a)
    {
         age=a;

    }
      madhuri (int a,int b)
    {
         age=a+b;

    }

      void show ()
      {
        System.out.println("values are=" +age);

      }
}
class neelam1
{
      public static void main ( String args [] )
    {
      madhuri a = new madhuri ();
      madhuri b = new madhuri (100);
      madhuri c = new madhuri (200,300);
      a.show ();
      b.show ();
      c.show ();

    }
}






    

