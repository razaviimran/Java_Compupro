
import java.io.*;

class kiran11
{
	public static void main(String args[] ) throws IOException
	{

		InputStreamReader in = new InputStreamReader( System.in ) ;
		BufferedReader br = new BufferedReader( in );

		String s;

		System.out.println( "Enter number  =  ");
		s = br.readLine();		

		int a = Integer.parseInt( s );

		System.out.println( "Enter number  =  ");

		s = br.readLine();		

		int b = Integer.parseInt( s );

		System.out.println( "Total = " +(a+b) );

	}
}
