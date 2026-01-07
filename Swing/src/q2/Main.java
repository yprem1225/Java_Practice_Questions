package q2;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Main extends JFrame{
	
	JLabel label1,label2,label3,label4,label5,label6;
	JTextField field1,field2,field3,field4,field5,field6;
	JButton button1, button2;
	
	public Main() {
		setLayout(new FlowLayout());
		
		label1=new JLabel("Name");
		label2=new JLabel("Contact");
		label3=new JLabel("Mobile");
		label4=new JLabel("Gender");
		label5=new JLabel("Comment");
		label6=new JLabel("city");
		
		field1=new JTextField(20);
		field2=new JTextField(20);
		field3=new JTextField(20);
		field4=new JTextField(20);
		field5=new JTextField(20);
		field6=new JTextField(20);
		
		button1=new JButton("Submit");
		button2= new JButton("Reset");
		
		add(label1);
		add(field1);
		
		add(label2);
		add(field2);
		
		add(label3);
		add(field3);
		
		add(label4);
		add(field4);
		
		add(label5);
		add(field5);
		
		add(label6);
		add(field6);
		
		
		add(button1);
		add(button2);
		
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Main();
	}
	

}
