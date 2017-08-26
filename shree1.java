import java.awt.*;
import java.applet.*;

public class shree1 extends Applet
{
	public void paint(Graphics g)
	{
	       Font f1 = new Font("Arial" , Font.BOLD + Font.ITALIC , 20 );
	       Font f2 = new Font ("times new roman",Font.BOLD+Font.ITALIC,25);

        	       g.setFont(f1);
	       g.drawString("Hello Friend", 200,100 );
 
 	       g.setFont(f2);
	       g.drawString("Hi how r u",100,300);

	}


/*
<applet code="shree1.class" height=400  width=400 > </applet>
*/
}