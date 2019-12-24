//for Checkbox.
import java.awt.*;
class CheckboxExample
{
	CheckboxExample()
	{
		Frame f=new Frame();
		Checkbox ch1=new Checkbox("C++");
		ch1.setBounds(100,100,50,50);
		Checkbox ch2=new Checkbox("Java",true);
		ch2.setBounds(150,150,50,50);
		f.add(ch1);
		f.add(ch2);
		f.setBackground(Color.cyan);
		f.setSize(300,300);
		f.setLayout(null);
		f.setTitle("Third Program");
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new CheckboxExample();
	}
}