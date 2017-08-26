import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

public class factclient 
{
public static void main( String args[] )
{
try
{
	fact   f = ( fact ) Naming.lookup( "rmi://localhost/fact" );
	double ans = f.getfact( 5 );
	System.out.println( ans );
}
catch( Exception e )
{
System.out.println( e.getMessage() );
}	
}
	
}