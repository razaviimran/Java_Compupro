import java.io.*;

class ex12
{
	public static void main( String args[] )
	{
		int x=10,y=5,z;
		int a[] = new int[5];

			try
			{
				z = x/y;
				System.out.println("Ans =  " +z  );

				a[4] = 10;
				System.out.println( "Answer =  " +a[4]  );

			FileInputStream fin;
			fin = new FileInputStream( "iooooooo.java" );
			
			}
			catch( ArithmeticException  xx )
			{
			System.out.println("My Error =  " +xx );
			}
			catch( ArrayIndexOutOfBoundsException xx )
			{
				System.out.println("My Error =  " +xx );
			}
			catch( Exception  xx )
			{
			System.out.println("My Testing  Error =  " +xx );
			}
			
			finally
			{
				System.out.println("Its always run");
			}	
	System.out.println( "Hello Friend");
	}
}