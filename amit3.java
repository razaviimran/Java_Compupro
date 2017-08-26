import java.awt.*;
import javax.swing.*;

public class amit3
{

	static JFrame frame;
	static JPanel  panel;
	JLabel lbankname,lname,lemailid, lsubject, lmessage, blabel;
	JTextField tname,temailid,tsubject;
	JTextArea tamessage;
	JButton submit,reset;

	GridLayout g1;

	public amit3()
	{
		g1 = new GridLayout(2,2);
		panel = new JPanel();
		frame = new JFrame("My Frame");
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout( 6,2,20,20 ) );

		lbankname = new JLabel("MoneySaver Corporation");
		lbankname.setFont( new Font("Arial", Font.BOLD+Font .ITALIC, 25 ));
		blabel = new JLabel("    ");

		lname = new JLabel("      Name");
		lemailid = new JLabel("      E-mail ID ");
		lsubject = new JLabel("      Subject");
		lmessage = new JLabel("    Message ");

		tname = new JTextField(2);
		temailid = new JTextField(2);
		tsubject = new JTextField("Enter your subject" ,2);
		tamessage = new JTextArea(3,20);

	 submit = new JButton("Submit form" );
	 reset     = new JButton("Reset information");
			
	panel.add(lbankname);
	panel.add(blabel);
	panel.add(lname);
	panel.add(tname);
	panel.add(lemailid);
	panel.add(temailid);
	panel.add(lsubject);
	panel.add(tsubject);
	panel.add(lmessage);
	panel.add(tamessage);
	panel.add(submit);
	panel.add(reset);

	}
	

	public static void main( String args[] )
	{

		amit3 bs = new amit3();

		frame.setSize(600,600);	

		frame.setVisible(true);
	}

}