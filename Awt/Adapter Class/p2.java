import java.awt.*;
import java.awt.event.*;
class WindowExample extends WindowAdapter
{
	Frame f;
	WindowExample()
	{
		f=new Frame("Window Adapter");
		f.addWindowListener(this);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public void windowClosing(WindowEvent e)
	{
		f.dispose();
	}
	public static void main(String args[])
	{
		new WindowExample();
	}
}