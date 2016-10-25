/*<applet code=AppletLifecycle width=300 height=300>
</applet>*/
import java.awt.*;
import java.applet.*;
public class AppletLifecycle extends Applet
{
	public void init()
	{
		System.out.println("Start init() method");
		setBackground(Color.green);
	}
	public void start()
	{
		System.out.println("Start start() method");
	}
	public void paint(Graphics g)
	{
		
		g.setColor(Color.red);
		g.drawString("Hello to Appet",100,100);
		System.out.println("Start paint() method");
	}
	public void stop()
	{
		System.out.println("Start stop() method");
	}
	public void destroy()
	{
		System.out.println("Start destroy() method");
	}
}
