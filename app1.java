import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.applet.Applet;
import java.awt.Graphics;

public class app1 extends Applet implements MouseListener
{

    StringBuffer buffer;

    public void init()
    {
	addMouseListener(this);
	buffer = new StringBuffer();
        addItem("initializing... ");
    }

    public void start()
    {
        addItem("starting... ");
    }

    public void stop()
    {
        addItem("stopping... ");
    }

    public void destroy()
    {
        addItem("preparing for unloading...");
    }

    void addItem(String newWord)
    {
        System.out.println(newWord);
        buffer.append(newWord);
        repaint();
    }

    public void paint(Graphics g)
    {
	//Draw a Rectangle around the applet's display area.
        g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);

	//Draw the current string inside the rectangle.
        g.drawString(buffer.toString(), 5, 15);
    }

    public void mouseClicked(MouseEvent event)
    {
	addItem("click!... ");
    }
}
