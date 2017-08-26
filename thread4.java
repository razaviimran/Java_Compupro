class myclass2 implements Runnable
{
    String name;
    Thread t;
    myclass2( String threadname )
    {

       name = threadname;

       t = new Thread( this, name );

       System.out.println("new thread : " +t );

       t.start();
    }

    public void run()
    {
           try
           {
                 for(int n=5; n>0; n-- )
                 {
                         System.out.println(name +" : " +n );
                         Thread.sleep(1000);
                 }
           }
           catch( InterruptedException e )
           {

                System.out.println( name + "Interrupted ");

           }

       System.out.println(name + " Exiting ");
    }

}


class thread4
{

    public static void main( String args[] )
    {
         new myclass2("ayub");
         new myclass2("archu");
         new myclass2("trupti");

         try
         {
             Thread.sleep(10000);
         }
         catch( InterruptedException e )
         {

              System.out.println("Main thread interrupted " );
         }

      System.out.println("Main thread exiting ");
    }


}
