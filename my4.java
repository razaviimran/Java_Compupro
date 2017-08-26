import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*  <applet code='my4' width=600 height=500></applet> */

public class my4 extends Applet implements ItemListener
{
	String msg="";
	Checkbox winxp, winvista, mac;
	
	public void init()
	{
		winxp = new Checkbox("Windows XP",null, true );
		winvista = new Checkbox("Windows Vista" );
		mac = new Checkbox("Mac OS" );

		add(winxp);
		add(winvista);
		add(mac);

		winxp.addItemListener(this);
		winvista.addItemListener(this);
		mac.addItemListener(this);
	}

	public void itemStateChanged( ItemEvent ie )
	{
		repaint();
	}	

	public void paint( Graphics g )
	{
		msg = "Current state : ";
		g.drawString( msg, 50,100 );
		
		msg = "";
		msg =  msg + winxp.getState();
		g.drawString( msg, 50,200 );

		msg = "";
		msg =  msg + winvista.getState();
		g.drawString( msg, 50,300 );

		msg = "";
		msg =  msg +  mac.getState();
		g.drawString( msg, 50,400 );
	}
}