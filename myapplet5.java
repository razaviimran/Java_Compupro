import java.awt.*;
import java.applet.*;

public class myapplet5 extends Applet
{

        String s1;

        public void init()
        {
              setBackground( Color.green );
        }


	public void paint( Graphics g )
	{
	               g.drawString( "This is in the applet windows " , 50,50  );
	               showStatus("This message appear in status windows ");
	}

/*
<applet code="myapplet5.class" height=400  width=400 > </applet>
*/
}
