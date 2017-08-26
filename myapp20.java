
import java.applet.*;
import java.awt.event.*;
import java.awt.*;

/*
<applet code="myapp20" height=300 width=400 ></applet>
*/

public class myapp20 extends Applet implements ActionListener
{
	String msg = "";
	Button yes, no, maybe;

	public void init()
	{
		yes = new Button("Yes");
		no = new Button("No");
		maybe = new Button("Undecided");


		add(yes);
		add(no);
		add(maybe);

		yes.addActionListener(this);
		no.addActionListener(this);
		maybe.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String str = ae.getActionCommand();
	

		if(str.equals("Yes"))
		{

			msg = "you p yes";
		}
		else if(str.equals("No"))
		{

			msg = "you pressed no";					
		}
		else
		{

			msg = "you pressed undecided";					
		}

		repaint();

	}
	public void paint(Graphics g)
	{

		g.drawString(msg, 6, 100) ;
	}

}

