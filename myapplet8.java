import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class myapplet8 extends Applet implements KeyListener
{

        String msg = " ";
        int x=10, y=40;


        public void init()
        {
              addKeyListener(this);

              requestFocus();
        }


        public void keyReleased( KeyEvent ke )
        {

                showStatus("Key Released " );
        }

        public void keyTyped( KeyEvent ke )
        {

                msg = msg + ke.getKeyChar();
        }


        
        public void keyPressed( KeyEvent ke )
        {

        showStatus("Key Pressed ");

        int k = ke.getKeyCode();

        switch(k)
        {
             case KeyEvent.VK_PAGE_UP:

                  msg = msg +"<PgUp>" ;
             break;

             case KeyEvent.VK_PAGE_DOWN:

                  msg = msg +"<PgDnm>" ;
             break;

             case KeyEvent.VK_LEFT:

                  msg = msg +"<Left Arrow>" ;
             break;

             case KeyEvent.VK_RIGHT:

                  msg = msg +"<Right Arrow>" ;
             break;

             case KeyEvent.VK_UP:

                  msg = msg +"<Up Arrow>" ;
             break;

             case KeyEvent.VK_DOWN:

                  msg = msg +"<Down Arrow>" ;
             break;
        }

        repaint();
        }
        

        public void paint( Graphics g )
	{
	               g.drawString( msg ,x ,y );
	}


/*
<applet code="myapplet8.class" height=400  width=400 >
</applet>
*/

}
