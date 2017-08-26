//Reading string from file




import java.io.*;
class io4
{
	public static void main( String args[] ) throws IOException
	{

		int i;

		FileInputStream xyz;

		try
		{
			xyz = new FileInputStream( args[0]  );
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
		         	i = xyz.read();

				if ( i != -1 )
	           			System.out.print( (char)i );

         		}while( i != -1 );

     	xyz.close();
	}
}









