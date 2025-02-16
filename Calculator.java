import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Calculator extends JFrame implements ActionListener
{
	JTextField t1,t2,t3;
	JButton b1,b2,b3,b4;
	Calculator()
	{
		setTitle("Calculator");
		setSize(400,300);
		setLayout(new FlowLayout());
		t1 = new JTextField(10);
		add(t1);
		t2 = new JTextField(10);
		add(t2);
		b1 = new JButton("+");
		add(b1);
		b2 = new JButton("-");
		add(b2);
		b3 = new JButton("x");
		add(b3);
		b4 = new JButton("/");
		add(b4);
		t3 = new JTextField(10);
		add(t3);
		setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int a,b,c;
		a = Integer.parseInt(t1.getText());
		b = Integer.parseInt(t2.getText());
		if(ae.getSource() == b1)
		{
			c=a+b;
		}
		else if(ae.getSource() == b2)
		{
			c=a-b;
		}
		else if(ae.getSource() == b3)
		{
			c=a*b;
		}
		else
		{
			c=a/b;
		}
		t3.setText(""+c);
	}
	public static void main(String args[])
	{
		new Calculator();
	}
}
