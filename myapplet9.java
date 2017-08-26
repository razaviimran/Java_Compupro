import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class myapplet9 extends Applet implements MouseListener,MouseMotionListener
{

        String msg = " ";
        int X=0, Y=0;


        public void init()
        {
              addMouseListener(this);
              addMouseMotionListener(this);
        }

        public void mouseClicked( MouseEvent me )
        {
                X=100;
                Y=100;
                msg = "Mouse Clicked....";
                repaint();
        }

        public void mouseEntered( MouseEvent me )
        {
                X=0;
                Y=10;
                msg = "Mouse entered.........";
                repaint();
        }


        public void mouseExited( MouseEvent me )
        {
                X=0;
                Y=10;
                msg = "Mouse Exited.........";
                repaint();
        }

        public void mousePressed( MouseEvent me )
        {
                X= me.getX();
                Y= me.getY();
                msg = "Mouse Down.......";
                repaint();
        }

        public void mouseReleased( MouseEvent me )
        {
                X= me.getX();
                Y= me.getY();
                msg = "Mouse Up.....";
                repaint();
        }

        public void mouseDragged( MouseEvent me )
        {
                X= me.getX();
                Y= me.getY();
                msg = "*";
                showStatus("Dragging mouse " +X +"," +Y );

                repaint();
        }

        public void mouseMoved( MouseEvent me )
        {
                showStatus("Moving mouse " );
        }

        public void paint( Graphics g )
	{

               g.drawString( msg ,X ,Y );
               
	}

/*
<applet code="myapplet9.class" height=400  width=400 > </applet>
*/
}


