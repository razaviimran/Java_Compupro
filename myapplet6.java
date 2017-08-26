import java.awt.*;
import java.applet.*;
import java.net.*;

public class myapplet6 extends Applet
{


public void paint( Graphics g )
{
               String s1;

               URL url = getCodeBase();

               s1 = "Code Base path : " + url.toString();

               g.drawString( s1, 50,50  );

               url = getDocumentBase();

               s1 = "Document Base : " + url.toString();

               g.drawString( s1, 50,250  );
}

/*
<applet code="myapplet6.class" height=400  width=400 > </applet>
*/
}
