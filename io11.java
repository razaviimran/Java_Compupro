import java.io.*;

class io11
{
  public static void main( String args[] ) throws IOException
  {

	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	String str;
	int i;
	int sum=0;

	System.out.println("Enter numbers  0 to quit  ");

	do 
	{

		str = br.readLine();

			try
			{

				i = Integer.parseInt( str );

			}catch( NumberFormatException e )
			{
				System.out.println("Invalid format" );
				i =0;
			}

		sum = sum + i;
	}while( i != 0 );


	System.out.println("Current sum is  :   " +sum );

  }
}




