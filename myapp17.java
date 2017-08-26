
import java.applet.*;
import java.awt.event.*;

/*
<applet code="myapp17" height=300 width=400 ></applet>
*/

public class myapp17 extends Applet 
{
	public void init()
	{
		addMouseListener( new rinku(this) );	
	}
}

class rinku extends MouseAdapter
{
	myapp17 ob;

	public rinku( myapp17 ob )
	{
		this.ob = ob;	
	}


	public void mousePressed( MouseEvent me )
	{
		ob.showStatus( "Mouse Event Pressed....." );
	}	
}