import java.applet.*;
import java.awt.*;

public class myapplet10 extends Applet
{

       int width, height;

       public void init()
       {
          width = getSize().width;
          height = getSize().height;
          setBackground( Color.black );
       }

       public void paint( Graphics g )
       {
          	g.setColor( Color.green );

	for ( int i = 0; i < 10; ++i )
          	{
             		g.drawLine( width, height, i * width / 10, 0 );
          	}
      }
/*
<applet code="myapplet10.class" height=400 width=300>
</applet>
*/
}

