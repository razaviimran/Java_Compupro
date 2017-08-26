// Demonstrate Labels
import java.awt.*;
import java.applet.*;

/*
<applet code="java1.class" width=500 height=500>
</applet>
*/

public class java1 extends Applet
{
     public void init() 
	{
	Label  one   =  new Label ("One display message ") ;
	Label  two   =  new Label ("Enter 1st number") ;
	Label  three  = new Label ("Enter 2nd number ");

	// add labels to applet window
	add (one) ;
	add (two) ;
	add (three);
       	}
}