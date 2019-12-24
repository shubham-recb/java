//for Choice (drop down menu).
import java.awt.*;
class ChoiceExample
{
	ChoiceExample()
	{
		Frame f=new Frame("Choice Example");
		Choice c=new Choice();
		c.setBounds(100,100,75,75);
		c.add("Items1");
		c.add("Items2");
		c.add("Items3");
		c.add("Items4");
		f.add(c);
		f.setSize(300,300);
		f.setLayout(null);
		f.setTitle("Fourt Program");
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new ChoiceExample();
	}
}