//Reading string

import java.io.*;

class io3
{
  public static void main( String args[] ) throws IOException
  {

   String abc[] = new String[100];

   BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

   System.out.println("Enter String  'quit' to exit ");

     
     for( int i=0; i<100; i++ )
     {

	         abc[i] = br.readLine();

	          if( abc[i].equals("quit") )
          		{
           			break;
          		}
  }	
}