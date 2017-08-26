//Demostate check box group.
import java.awt. * ;
import java.awt.event.*;
import java.applet.*;

/*
	<applet code = "java4" width=250 height=200>
	</applet>
*/
public class java4 extends Applet implements ItemListener
{
	String msg= "";
	Checkbox winXP, winVista, solaris, mac;
	CheckboxGroup cbg;

	public void init()
	{
		cbg = new CheckboxGroup();

		winXP = new Checkbox ("Windows Xp", cbg, true);
		winVista = new Checkbox ("Windows Vista", cbg, false);
		solaris = new Checkbox ("Solaris", cbg, false);
		mac = new Checkbox ("Mac OS", cbg, false);

		add(winXP);
		add(winVista);
		add(solaris);
		add(mac);

		winXP.addItemListener ( this) ;
		winVista.addItemListener ( this);
		solaris.addItemListener (this);
		mac.addItemListener ( this);
	}

	public void itemStateChanged( ItemEvent ie)
	{
		repaint();
	}

// Display current state of the check boxes,
	public void paint( Graphics g)
	{
	msg = " current state: ";
	g.drawString (msg, 6,80);

	msg = " Windows Xp: " + winXP.getState() ;
	g.drawString (msg, 6,100) ;

	msg = " Windows Vista : " + winVista.getState();
	g.drawString (msg,6,120) ;

	msg = " Solaris: "  + solaris.getState();
	g.drawString (msg, 6,140);

	msg =" Mac OS: " + mac.getState();
	g.drawString (msg, 6,160);
	}
}