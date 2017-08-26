import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*  <applet code='my6' width=600 height=500></applet> */

public class my6 extends Applet implements ItemListener
{
	String msg="";
	Choice os, browser;
	CheckboxGroup cbg;
	
	
	public void init()
	{
		os = new Choice();
		browser = new Choice();

		os.add("Windows xp");
		os.add("Windows Vista");
		os.add("Mac OS");

		browser.add("Internet Exploere");
		browser.add("Fire Fox");
		browser.add("Opera");

		os.addItemListener(this);
		browser.addItemListener(this);
	}

	public void itemStateChanged( ItemEvent ie )
	{
		repaint();
	}	

	public void paint( Graphics g )
	{
		msg = "Current OS  : ";
		msg = msg + os.getSelectedItem();
		g.drawString( msg, 50,100 );

		msg = "Current Browser  : ";
		msg = msg + browser.getSelectedItem();
		g.drawString( msg, 50,300 );

	}
}