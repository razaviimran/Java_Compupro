import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*  <applet code='my5' width=600 height=500></applet> */

public class my5 extends Applet implements ItemListener
{
	String msg="";
	Checkbox winxp, winvista, mac;
	CheckboxGroup cbg;
	
	
	public void init()
	{
		winxp = new Checkbox("Windows XP",cbg, true );
		winvista = new Checkbox("Windows Vista" ,cbg, false );
		mac = new Checkbox("Mac OS", cbg, false );

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
		msg = "Current Selection  : ";
		msg = msg + cbg.getSelectedCheckbox().getLabel();
		g.drawString( msg, 50,100 );

	}
}