import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class amit1 extends JApplet
{
 	public void init()
	{	
		Container cobj = getContentPane();

		cobj.setLayout( new FlowLayout() );

		Button btn = new Button("Click Here" );

		cobj.add( btn );
	}	
 



/*
<applet code="amit1.class" height=300 width=300 > 
</applet>
*/
}