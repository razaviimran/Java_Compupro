import java.awt.*;
import javax.swing.*;

/* <applet code="JTextFieldDemo" width=300 height=50>
</applet>
*/

public class JTextFieldDemo extends JApplet
{
	JTextField jtf;
	public void init()
	{
		Container contentpane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		jtf = JTextField(15);
		contentpane.add(jtf);
	}
}