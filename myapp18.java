
import java.applet.*;
import java.awt.event.*;

/*
<applet code="myapp18" height=300 width=400 ></applet>
*/

public class myapp18 extends Applet 
{
	public void init()
	{
		addMouseListener( new MouseAdapter() 
		{
			public void mousePressed( MouseEvent me )
			{
				showStatus( "Mouse Event Pressed....." );
			}	
			
		});
	}
}

