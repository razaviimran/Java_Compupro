
import java.awt.*;
import java.applet.*;
import java.net.*;

/*
<applet code="myapp16" height=600 width=800 ></applet>
*/

public class myapp16 extends Applet
{
	public void start()
	{
		AppletContext ac = getAppletContext();
		URL  url = getCodeBase();

		try
		{
			ac.showDocument( new  URL( url+"test.html" )  );
		}
		catch( MalformedURLException e )
		{
			showStatus( "URL not found" );
		}
	}
}
