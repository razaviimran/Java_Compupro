// Using suspend() and resume().

class NewThread implements Runnable
{
	String name;  // name of thread
  	Thread t;

	NewThread(String threadname)
	{
		name = threadname;
 		t = new Thread(this, name);	
		System.out.println("New thread: " + t);
		t.start(); // Start the thread	
	}
	
	//This is the entry point for thread
	public void run()
	{
		try
		{
			for(int i=15; i>0; i--)
			{
				System.out.println( name + ": " + i);
				Thread.sleep(200);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(name + " interrupted.");
		}
		System.out.println(name + "exiting. ");
	}		
}

class SuspendResume1
{
	public static void main(String args[])
	{
		NewThread ob1 = new NewThread ("one");
		NewThread ob2 = new NewThread ("two");

		try
		{
			Thread.sleep(1000);
			ob1.t.suspend();
			System.out.println("Suspending thread one");
			Thread.sleep(1000);
			ob1.t.resume();
			System.out.println("Resuming thread one");	
			ob2.t.suspend();
			System.out.println("Suspending thread two");
			Thread.sleep(1000);
			ob2.t.resume();
			System.out.println("Resuming thread two");
		}
			catch (InterruptedException e)
			{
				System.out.println("Main thread interrupted");	
			}	
			// wait for threads to finish
			try
			{
			    System.out.println("Waiting for threads to finish");
			     ob1.t.join();
			     ob2.t.join();			
			}	
			catch(InterruptedException e)
			{
				System.out.println("Main thread interrupted");

			}
				System.out.println("Main thread exiting.");
	}	


}
   






