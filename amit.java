import java.awt.*;
import java.applet.*;

public class amit extends Applet
{

	public void paint( Graphics g )
	{

	   Font f = new Font("Arial", Font.BOLD, 16 );
	   g.setFont( f );
	   g.drawString("hello friend ", 100,100 );
	}

/*
<applet code="amit.class" height=300 width=300 > 
</applet>
*/

}