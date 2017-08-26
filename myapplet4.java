import java.awt.*;
import java.applet.*;

public class myapplet4 extends Applet
{
        String s1;
        public void init()
        {
              setBackground( Color.red );
              setForeground( Color.yellow );
              s1 = "Begin Applet with init...      ";
        }

        public void start()
        {
             s1 = s1 +" Inside start .... ";
        }

        public void paint( Graphics g )
       {
               s1 = s1 + " Inside Paint .... ";
               g.drawString( s1, 10,200 );
        }

/*
<applet code="myapplet4.class" height=500  width=500 > </applet>
*/
}
