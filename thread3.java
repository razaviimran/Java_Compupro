class myclass1 extends Thread
{
    Thread  t;
    myclass1()
    {
       t = new Thread( this, "Demo thread" );
       System.out.println("child thread : " +t );
       t.start();
    }

    public void run()
    {
           try
           {
                 for(int n=5; n>0; n-- )
                 {
                         System.out.println("child thread : " +n );
                         Thread.sleep(500);
                 }
           }
           catch( InterruptedException e )
           {
                System.out.println("child interrupted");
           }
       System.out.println("Exit from child thread");
    }

}


class thread3
{

    public static void main( String args[] )
    {
         new myclass1(); //create a new thread

         try
         {
              for( int i=5; i>0; i-- )
              {

                     System.out.println("Main Thread : " +i );
                     Thread.sleep(1000);
              }
         }
         catch( InterruptedException e )
         {
              System.out.println("Main thread interrupted " );
         }
      System.out.println("Main thread exiting ");

    }

}
