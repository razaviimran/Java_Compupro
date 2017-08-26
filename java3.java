//Demostrate check boxes,
import java . awt.*;
import java . awt.event.*;
import java.applet.*;

/*
	<applet code="java3.class" width=250 height=200>
	</applet>
*/

public class java3 extends Applet implements ItemListener
{

	String msg = "";
	Checkbox winXp, winVista, solaris, mac;

	public void init()
	{
		winXp = new Checkbox ( "Windows XP", null, true);
		winVista = new Checkbox("windows Vista");
		solaris = new Checkbox("Solaris");
		mac = new Checkbox("Mac OS");

		add (winXp);
		add(winVista);
		add(solaris);
		add(mac);

		winXp.addItemListener (this);
		winVista.addItemListener (this);
		solaris.addItemListener (this);
		mac.addItemListener (this);
	}

	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}

// Display current state of the check boxes.

	public void paint(Graphics g)
	{
		msg  = "Current state  : " ;
		g. drawString (msg, 6, 80 );

		msg = " Windows XP : " + winXp.getState() ;
		g. drawString (msg, 6, 100) ;

		msg = " Windows Vista : " + winVista.getState();
		g. drawString (msg, 6, 120) ;

		msg = " Solaris : " + solaris.getState();
		g.drawString (msg, 6, 140);

		msg = " Mac OS : " +mac.getState();
		g.drawString (msg, 6, 160);
	}
}
 
