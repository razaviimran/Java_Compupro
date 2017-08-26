import java.io.*;

class io1111
{
  public static void main( String args[] ) throws IOException
  {
	char a[] = { 'a', 'b', '5', '?',  'A', ' '  };
	
	for( int i=0; i<a.length;  i++)
	{

		if ( Character.isDigit(  a[i] ) )
			System.out.println( a[i] +"  is digit " );
		if ( Character.isLetter(  a[i] ) )
			System.out.println( a[i] +"  is letter " );
		if ( Character.isWhitespace(  a[i] ) )
			System.out.println( a[i] +"  is white space " );
		if ( Character.isUpperCase(  a[i] ) )
			System.out.println( a[i] +"  is upper case " );
		if ( Character.isLowerCase(  a[i] ) )
			System.out.println( a[i] +"  is lower case " );

	}
  }

}
