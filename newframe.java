import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.awt.*;
import java.util.Date;

public class newframe extends JFrame {
	
	long start = System.currentTimeMillis();
  public static void main(String[] args) {
newframe frameTabel = new newframe();

}

JLabel welcome   = new JLabel("Welcome to a New Frame");


JButton welcom= new JButton("Disable ");
JPanel panel = new JPanel();

newframe(){
super("Welcom");
setSize(800,800);
setLocation(100,50);

panel.setLayout (null); 

welcom.countComponents();

panel.add(welcome);

getContentPane().add(panel);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
}

	
}



