import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*  <applet code='my3' width=600 height=500></applet> */

public class my3 extends Applet implements ActionListener
{
	String msg="";
	Button yes,no,maybe;
	
	public void init()
	{
		yes = new Button("Yes");
		no = new Button("No");
		maybe = new Button("MayBe");

		add(yes);
		add(no);
		add(maybe);

		yes.addActionListener(this);
		no.addActionListener(this);
		maybe.addActionListener(this);
	}

	public void actionPerformed( ActionEvent ae )
	{
		String str = ae.getActionCommand();

		if ( str.equals("Yes") )
		msg = "You pressed Yes ";
		else if ( str.equals("No") )
		msg = "You pressed No";
		else
		msg = "You pressed May    be";
	repaint();
	}	

	public void paint( Graphics g )
	{
		g.drawString( msg, 150,200 );
	}
}