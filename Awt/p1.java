//By using extends frame.
import java.awt.*;
class First extends Frame
{
	First()
	{
		Button b=new Button("Click Me");
		Font f=new Font("courier",Font.ITALIC,22);
		b.setFont(f);
		b.setBounds(100,100,180,130);
		b.setBackground(Color.cyan);
		setForeground(Color.yellow);
		add(b);
		setSize(300,300);
		setLayout(null);
		setTitle("First Program");
		setVisible(true);
		setBackground(Color.yellow);
	}
	public static void main(String args[])
	{
		First f=new First();
	}
}