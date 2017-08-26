
import java.io.*;

class io20
{
	public static void main(String args[] ) throws IOException
	{
		int a,b,c;
		String s;

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

		s = br.readLine();		

		a = Integer.parseInt( s );

		s = br.readLine();		

		b = Integer.parseInt( s );

		c = a+b;

		System.out.println( "Total    =     " +c );

	}
}
