import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class ChoiceDemo extends Applet implements ItemListener
{
	Choice os, browser;
	String msg ="";
		
	public void init()
	{
		os = new Choice();
		browser = new Choice();

		os.add("Windows XP");
		os.add("Windows Vista");
		os.add("Solaris");
		os.add("Mac OS");
		
		browser.add("Internet Explorer");
		browser.add("Firefox");
		browser.add("Opera");
	
		add(os);
		add(browser);
		
		os.addItemListener(this);
		browser.addItemListener(this);
	}
	
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	
	public void paint(Graphics g)
	{
		msg= "Current OS: ";
		msg+= os.getSelectedItem();
		g.drawString(msg,6,120);
		msg= "Current Browser : ";
		msg+= browser.getSelectedItem();
		g.drawString(msg,6,140);
	}
}
/*
<applet code="ChoiceDemo" width=300 height=180>
</applet>
*/

