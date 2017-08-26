// Demostrate check box group.
import java .awt.*;
import java.awt.event.*;
import java.applet.*;
/*
	<applet code = "CBGroup" width=250 height=200>
	</applet>
*/

	public class CBgroup  extends Applets implements ItemListener {
		String msg = "";
Checkbox winXp ,winVista, solaris, mac;
checkboxGroup cbg;

public void init( ) {
	cbg = new CheckboxGroup () ;
	winXP = new Checkbox ( "Window XP ", cbg, true);
	winVista = new Checkbox ("Windows Vista", cbg, false);
	solaris= new Checkbox("Solaris", cbg, false);
	mac= new Checkbox ("Mac OS",cbg, false);

	add (winXp);
	add (winVista);
	add (solaris);
	add (mac);

	winXp.addItemListener(this);
	winVista.addItemListener(this);
	solaris.addItemListener(this);
	mac.addItemListener(this);
}

public void itemStateChanged(ItemEvent ie) {
	repaint( );
}

//Display current state of the check boxes.
public void paint(Graphics g) {
	msg = "Current selection: " ;
	msg += cbg.getSelectedCheckbox().getLabel();
	g.drawString(msg, 6, 100);
}
	}

