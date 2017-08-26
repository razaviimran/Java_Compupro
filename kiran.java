
import java.io.*;

class kiran
{
	public static void main(String args[] ) throws IOException
	{
		int a,b,c;
		String s;

		InputStreamReader in = new InputStreamReader( System.in ) ;
		BufferedReader br = new BufferedReader( in );

		System.out.println( "Enter number  =  ");
		s = br.readLine();		

		a = Integer.parseInt( s );

		System.out.println( "Enter number  =  ");
		s = br.readLine();		

		b = Integer.parseInt( s );

		c = a+b;

		System.out.println( "Total = " +c );

	}
}
