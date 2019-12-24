//By creating object of Frame class.
import java.awt.*;
class Second
{
	Second()
	{
		Frame f=new Frame();
		Button b=new Button("Click Me");
		b.setBounds(100,100,80,30);
		b.setBackgroud(Color.cyan);
		f.add(b);
		f.setSize(300,300);
		f.setLayout(null);
		f.setTitle("Second Program");
		f.setVisible(true);
	}
	public static void main(String args[])
		{
			Second s=new Second();
		}
}