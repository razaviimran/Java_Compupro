import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

public class factserver
{
	public static void main( String args[] )
	{
	try
	{
	     factimpl  f = new factimpl();
	     Naming.rebind("rmi://localhost/fact", f );
	System.out.println( "object bound" );
	}catch( Exception e )
	{
	System.out.println( e.getMessage() );
	}

	}
}