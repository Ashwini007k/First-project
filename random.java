import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class random extends JFrame implements ActionListener
{
  JLabel lbl1;
	JTextField txt;
	JButton btn;
	Container c=getContentPane();
	random()
	{
		lbl1=new JLabel("Hello World!!!");
		txt=new JTextField();
		btn=new JButton("Get");
		c.setLayout(null);
		lbl1.setBounds(100,100,100,10);
		c.add(lbl1);
		txt.setBounds(100,120,100,50);
		c.add(txt);
		btn.setBounds(250,120,100,50);
		c.add(btn);
		btn.addActionListener(this);

	}
	public void actionPerformed(ActionEvent ae)
	{
		String str=txt.getText();
		char a[]=new char[30];int j=0;
		for(int i=str.length()-1;i>=0;i--)
			{a[j]=str.toCharArray()[i];j++;}
		Label lbl2;
		lbl2=new Label(String.copyValueOf(a));
		setLayout(null);
		lbl2.setBounds(120,170,100,10);
		c.add(lbl2);
		txt.setText("");
		
	}
	public static void main(String args[])
	{
		random obj=new random();
		obj.setSize(500,500);
		obj.setVisible(true);
	}
}
