//To execute this program keep an image in your PWD

/* <applet code="MoveApplet.class" width = 600 height= 450>
</applet> */
import java.applet.*;
import java.awt.*;
public class MoveApplet extends Applet
{ 
	public void paint (Graphics g)
	{ 
		Image i = getImage (getDocumentBase (),"plane.gif");
		for (int x= 0 ; x<=1000 ; x++)
		{ 
			g.drawImage (i, x, 0, null);
			try
			{ Thread.sleep (20);}	
			catch(InterruptedException ie) { }
		}
	}
}
