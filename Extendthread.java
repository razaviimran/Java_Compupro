//Create a second thread by extending thread 
class NewThread extends Thread
{
	NewThread()
	{
		//create a new, second thread
		super("Demo thread");
		System.out.println("Child thread :" +this);
		start();	//start the thread
	}
	
	//this is the entry point for the second thread
	public void run()
	{
		try
		{
			for(int i=5 ; i>0 ; i--)
			{
				System.out.println("Child thread:" +i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Child interrupted");
		}
		
		System.out.println("Exiting child thread");
	}
}

class Extendthread
{
	public static void main( String args[] )
	{
		new NewThread();	//create new thread
		
		try
		{
			for(int i = 5; i>0; i--)
			{
				System.out.println("Main thread : " +i);
				Thread.sleep(1000);
			}
		}
		catch (InterruptedException e)
		{
			System.out.println("Main thread interrupted");

		}
		
		System.out.println("Main thread exiting");
	}
}	