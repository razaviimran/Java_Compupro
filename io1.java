//Reading character
// InputStreamReader xyz = new InputStreamReader(System.in) );

// BufferedReader br = new BufferedReader( xyz );
import java.io.*;

class io1
{
  public static void main( String args[] ) throws IOException
  {

char c;

BufferedReader br = new BufferedReader( new InputStreamReader(System.in));


   System.out.println("Enter character 'q' to exit ");

     do
     {
	         	c = (char)br.read();

         		System.out.println( c );

     }while( c != 'q' );

  }



}



