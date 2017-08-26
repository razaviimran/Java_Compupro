
import java.io.*;

class io_sum
{
  public static void main( String args[] ) throws IOException
  {

	String str;
	int a,b,c;
	
	BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

	System.out.print("Enter 1st number =  ");
	str = br.readLine();

	a = Integer.parseInt( str );

	System.out.print("Enter 2nd number =  ");
	str = br.readLine();
	b = Integer.parseInt( str );

	c = a+b;
	System.out.println("Answer		 =  "+c);
  }

}
