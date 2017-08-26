import java.awt.*;
import java.applet.*;

public class myapplet1 extends Applet
{
	public void paint( Graphics g )
	{
	
		Font f = new Font("Impact" , Font.BOLD, 26 );
		g.setFont( f );
	
		g.drawString("Ayub", 300,300 );
		g.drawString("Compupro Classes", 100,100 );
	}

}

/*
<applet code='myapplet1' height=500 width=500 ></applet>
*/

     