import java.awt.*;
import java.applet.*;

public class paddy extends Applet
{

	public void paint( Graphics g )
	{

        Font f1 = new Font("Arial" , Font.BOLD + Font.ITALIC , 20 );

        Font f2 = new Font("Impact" , Font.BOLD , 20 );


        g.setFont( f1 );

        g.drawString("Hello Applet", 200,100 );

	g.setFont( f2 );

        g.drawString("Hello Applet", 200,200 );
	}


/*
<applet code="paddy.class" height=400  width=400 > </applet>
*/
}
