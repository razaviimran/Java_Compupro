//Reading string

import java.io.*;
class io2
{
  public static void main( String args[] ) throws IOException
  {

   String str;

   BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

   System.out.println("Enter String  'Stop' to exit ");

     do
     {
         str = br.readLine();

         System.out.println(str);

     }while( !str.equals("stop") );

  }
}
