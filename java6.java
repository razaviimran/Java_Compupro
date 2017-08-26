//Demostrate Choice lists.
import java.awt.*;
import java.awt. event.*;
import java.applet.*;
/*
	<applet code="ChoiceDemo" width=300 height=180>
	</applet>
*/

public class ChoiceDemo extends Applet implement ItemListener {
	Choice os, browse;
	String msg="';

public void init(){
	os =new Choic ();
	browser =new Choice ( );
	
	// add items to os list
	os .add ("Windows XP");
	os .add ("Windows Vista");
	os .add ("Solaris");
	os .add ("Mac OS");

	// add items to browser list
	browser.add ("Internet Explorer");
	browser.add ("Firefox");
	browser.add ("Opera");

	// add choice lists to window
	add(os);
	add(browser);

	// register to receive item events
	os.addItemListener (this);
	browser .addItemListener(this);
}

public void itemStateChanged(ItemEvent ie) {
	repaint ( );
}

//Display current selections.
public void paint (Graphic  g) {
	msg = "Current OS:;
	msg += os.getSelectedItem();
	g.drawString (msg, 6,120);
	msg ="Current Browser :";
	msg += browser.getSelectedItem( );
	g.drawString (msg, 6, 140) ;
	}
} 