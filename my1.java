import java.awt.*;
import java.applet.*;

/*  <applet code='my1' width=600 height=500></applet> */

public class my1 extends Applet implements Runnable
{
	String msg="Agrawal Computer Classes";
	Thread t = null;
	int state;
	boolean flag;

	public void init()
	{
		setBackground( Color.cyan );
		setForeground( Color.red );
	}

	public void start()
	{
		t = new Thread(this);
		flag = false;
		t.start();
	}

	public void run()
	{
		char ch;

		for( ; ; )
		{
			try
			{	
			repaint();
			ch = msg substring( 1, msg, msg.length() );
			msg = msg+ch;
				if ( flag )
				break;
			}
			catch( InterruptedException e ){}
		}	
	}

	public void stop()
	{
		flag=true;
		t = null;
	}
	public void paint( Graphics g)
	{
		g.drawString( msg , 50,50 );
	}
}