import java.awt.*;
import java.awt.event.*;
class ButtonDemo extends Frame implements ActionListener
{
	Button rb,gb,bb,cb;
	ButtonDemo()
	{
		setLayout(new FlowLayout());
		rb=new Button("Red");
		gb=new Button("Green");
		bb=new Button("Black");
		cb=new Button("Close");
		rb.addActionListener(this);
		gb.addActionListener(this);
		bb.addActionListener(this);
		cb.addActionListener(this);
		cb.setForeground(Color.red);
		add(rb);
		add(gb);
		add(bb);
		add(cb);
		setTitle("Button in Action");
		setSize(300,300);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		String str=e.getActionCommond();
		if(str.equals("Red"))
		{
			setBackground(Color.red);
		}
		else if(str.equals("Green"))
		{
			setBackground(Color.green);
		}
		else if(str.equals("Black"))
		{
			setBackground(Color.black);
		}
		else if(str.equals("Close"))
		{
			System.exit(0);
		}
	}
	public static void main(String args[])
	{
		new ButtonDemo();
	}
}