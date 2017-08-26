import java.awt.*;
import java.applet.*;

public class shree2 extends Applet
{
	String s;
	public void init()
	{
		setBackground(color.black);
		setForeground(color.gold);
		s1="init begins first in applet ";
	}

	public void start()
	{
		s1=s1+"start begins second...";
	}
	
   
               public void paint( Graphics g )
	{

               s1 = s1 + " Inside Paint .... ";

               g.drawString( s1, 10,200 );
               }
/*
<applet code="shree2.class" height=400  width=400 > </applet>
*/
}



	}


}