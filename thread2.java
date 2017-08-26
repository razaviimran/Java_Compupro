class myclass implements Runnable
{
    Thread  t;
    myclass()
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

class thread2
{
    public static void main( String args[] )
    {
         new myclass(); //create a new thread

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
