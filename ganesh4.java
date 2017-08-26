//Reading string from file

import java.io.*;

class ganesh4
{
  public static void main( String args[] ) throws IOException
  {

   int i;
   FileInputStream fin;

   try
   {
        fin = new FileInputStream( "shashi.abc" );
   }
   catch( FileNotFoundException e )
   {
       System.out.println("File not found" );
       return;
   }
   catch( ArrayIndexOutOfBoundsException  e )
   {
       System.out.println("Show File " );
       return;
   }

     do
     {
         i = fin.read();

         if( i != -1 )
         {
           System.out.print( (char)i );
         }

     }while( i != -1 );

     fin.close();
  }
}
