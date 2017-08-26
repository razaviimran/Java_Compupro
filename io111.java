import java.io.*;

class io111
{
  public static void main( String args[] ) throws IOException
  {
	int num=78;

	System.out.println( num + "  in binary         :  " + Integer.toBinaryString(num) );

	System.out.println( num + "  in octal           :  " + Integer.toOctalString(num) );

	System.out.println( num + "  in hexdecimal  :  " + Integer.toHexString(num) );
  }
}
