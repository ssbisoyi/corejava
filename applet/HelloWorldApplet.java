import java.applet.*;
import java.awt.*;
/*
<applet code="HelloWorldApplet" width=300 height=50>
</applet>
*/
public class HelloWorldApplet extends Applet {
   public void paint (Graphics g) {
      g.drawString ("Hello World with Applet", 25, 50);
   }
}
