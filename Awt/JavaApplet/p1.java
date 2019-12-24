import java.awt.*;
import java.applet.Applet;
class Applet1 extends Applet
{
	public void init()
	{
		System.out.println("init(): applet initilized");
	}
	public void start()
	{
		System.out.println("start(): applet started");
	}
	public void paint()
	{
		System.out.println("paint(): applet painted");
	}
	public void stop()
	{
		System.out.println("stop(): applet stopped");
	}
	public void destroy()
	{
		System.out.println("destroy(): applet destroy");
	}
}