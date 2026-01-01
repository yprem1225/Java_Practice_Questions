package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Main extends JFrame{
	
	JLabel label1,label2;
	JTextField field1,field2;
	JButton button1, button2;
	
	public Main() {
	setLayout(new FlowLayout());
		
		label1=new JLabel("Username");
		label2=new JLabel("Password");
		
		field1=new JTextField(20);
		field2=new JTextField(20);
		
		button1=new JButton("Submit");
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String idtext=field1.getText().trim();
					String name=field2.getText().trim();
					
					int id = Integer.parseInt(idtext);
					
					PreparedStatement ps = GetConnection.getConnection().prepareStatement("select * from emp where id=? and name=?");
					ps.setInt(1, id);
					ps.setString(2, name);
					ResultSet rs= ps.executeQuery();
					
					if(rs.next()) {
						System.out.println("Login sucessfull...");
					}else {
						System.out.println("error");
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		button2=new JButton("Reset");
		
		add(label1);
		add(field1);
		add(label2);
		add(field2);
		add(button1);
		add(button2);
		
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Main();
	}
	

}
