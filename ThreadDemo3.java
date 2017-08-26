 class NewThread implements Runnable
{
 
   Thread t;
  
NewThread()
{
  // create a new, second thread
t= new Thread(this, "Demo Thread");
System.out.println("child thread : " + t);
t.start();
 }
 public void run()
{
  try
{
   for(int i=5; i>0; i--)
{
  System.out.println("child thread :" + i);
 Thread.sleep(500);
}
}
  catch(InterruptedException e )
{
  System.out.println("child interrupted");
}
  System.out.println("Exiting child thread");
}

}

  class ThreadDemo3
{
  public static void main(String args[])
{
   new NewThread();
  
  try
{
   for(int i=5; i>0; i--)
{
   System.out.println("Main Thread : " + i);
   Thread.sleep(1000);
}
}
  catch( InterruptedException e)
{
  System.out.println("Main Thread interrupted");
}

  System.out.println("Main thread exiting");
}

}
