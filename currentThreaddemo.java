class currentThreaddemo
{
	public static void main (String args[])
	{	
		Thread t = Thread.currentThread();

		System.out.println("current Thread: " + t );

		// change the name of the thread

		t.setName("My dost abdul Thread" );
 		System.out.println(" After name change: " + t);

			try
			{
    				for( int n=5; n>0; n--)
				{
					System.out.println(n);
   					Thread.sleep(1000);
				}  

			}  
			 catch (InterruptedException e)
			{
				  System.out.println("Main thread interrupted");

			}
	}

}