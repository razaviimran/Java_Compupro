import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="myapp21" width=600 height=600>
</applet>
*/
public class myapp21 extends Applet implements ActionListener 
{
	String msg = "";
	int x,y;

	Button ab[] = new Button[3];

	public void init()
	{
		x=20;
		y=20;

		Button yes = new Button("Yes");
		Button no = new Button("No");
		Button maybe = new Button("Undecided");

		// store references to buttons as added
			ab[0] = (Button) add(yes);  // type casting
			ab[1] = (Button) add(no);
			ab[2] = (Button) add(maybe);
		// register to receive action events

		for(int i = 0; i < 3; i++) 
		{
			ab[i].addActionListener(this);
		}
	}


	public void actionPerformed(ActionEvent ae)
	{
		for(int i = 0; i < 3; i++)
		{
		//if( ae.getSource() == ab[i] ) 
		//{
		msg = "You pressed " + ab[i].getLabel() + " ayub = " +ab[i] +"  archu = " +ae.getSource();
		//}


		}
		y=y+200;
		repaint();
	}

	public void paint(Graphics g)
	{
		g.drawString(msg, x, y );
	}
}