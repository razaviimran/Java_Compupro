import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class amit2 extends JApplet
{
 	public void init()
	{	
		Container cobj = getContentPane();

		//cobj.setLayout( new FlowLayout() );
		
		cobj.setLayout( new GridLayout(2,2, 5,5 ) );

		JLabel  lbl1 = new JLabel( "Enter your name" );
		JLabel  lbl2 = new JLabel( "Role " );

		JTextField txt1 = new JTextField( 15);

		JComboBox  cbox =   new JComboBox();
		cbox.addItem( "Manager" );
		cbox.addItem( "Executive" );
		cbox.addItem( "CEO" );

		cobj.add( lbl1   );
		cobj.add( txt1   );
		cobj.add( lbl2   );
		cobj.add( cbox );

	}	
 

/*
<applet code="amit2.class" height=200 width=300 > 
</applet>
*/
}