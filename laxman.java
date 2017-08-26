import java.awt.*;
import java.applet.*;

public class laxman extends Applet
{

    public void paint(Graphics g )
    {

	Font f = new Font("Arial", Font.BOLD, 24  );

        g.setFont(f);
  
	g.drawString("hell friend" ,100,100 );

    }
/*
<applet code="laxman.class" height=400 width=400> 
</applet>
*/	

}