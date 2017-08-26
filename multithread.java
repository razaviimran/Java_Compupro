//create multiple threads
class NewThread implements Runnable
{
	String name;
	Thread t;
	
	NewThread(String threadname)
	{
		name = threadname;
		t = new Thread( this,name);
		System.out.println("New thread  :  " +t);
		t.start();	//start the thread
	}
	
	//this is the entry point for thread
	public void run()
	{
		try 	
		{
			for(int i = 5; i>0; i--)
			{
				System.out.println(name + ":" +i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(name + "interrupted");
		}
		
		System.out.println(name  + " exiting");
	}
}

class multithread
{
	public static void main(String args[])
	{
		new  NewThread("one");	//start threads
		new  NewThread("two");
		new  NewThread("three");
		
		try 
		{
			//wait for another thread to end
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Main thread interrupted");
		}
		
		System.out.println("main thread exiting");
	}
}