import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class swingtest extends JFrame implements ActionListener
{
	JButton b1,b2;
	JLabel   l1;
	int count;

	final String str = "Number of times button clicks = "	;

	public swingtest( String strName )
	{
		super( strName );

		getContentPane().setLayout( new FlowLayout() );

		JPanel p = new JPanel();

		b1 = new JButton("Click me");
		b2 = new JButton("Quit");

		
		p.setLayout( new FlowLayout() );

		p.add(b1);
		p.add(b2);		

		l1 = new JLabel(str+count,JLabel.CENTER);

		getContentPane().add(p);
		getContentPane().add(l1);


		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}

	public void actionPerformed( ActionEvent e )
	{
		String s = e.getActionCommand();

		if ( "Click me".equals(s) )
		{
			count++;
			l1.setText( str + count );
		}
		if ( "Quit".equals(s) )
		{
			System.exit(0);
		}
	}


	public static void main( String args[] )
	{
		swingtest  st = new swingtest("Action Events");

		st.setSize( 300,300 );
		st.setVisible ( true );		

	}
	
}
