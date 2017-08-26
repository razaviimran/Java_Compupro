import java.applet.*;
import java.awt.*;
/*
	<applet code="myapplet15" width=500 height=500></applet>
*/

public class myapplet15 extends Applet implements Runnable
{
	String s = "Compupro Classes...   ";
	Thread t;
	boolean stopflag;

	public void init()	
	{
		setBackground( Color.cyan );
		setBackground( Color.red );
	}

	public void start()
	{
		t = new Thread( this );
		stopflag = false;
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
				Thread.sleep(100);
				ch = s.charAt( s.length()-1 );
				s = s.substring( 0, s.length()-1 );
				s = ch + s;
				if ( stopflag )
				break;
			}
			catch( InterruptedException e)
			{
			}

		}	
	}


	public void paint( Graphics g)
	{
		Font f = new Font( "Arial" , Font.BOLD, 20 );
		g.setFont( f );
		g.drawString( s , 50,30 );	
	}

	public void stop()
	{
		stopflag = true;
		t = null;
	}
}