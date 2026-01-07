package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Signup extends JFrame{
	JLabel label1,label2;
	JTextField field1,field2;
	JButton button1, button2;
	
	public Signup() {
		
		setLayout(new FlowLayout());
		
		label1=new JLabel("Username");
		label2=new JLabel("Password");
		
		field1=new JTextField(20);
		field2=new JTextField(20);
		
		button1=new JButton("Submit");
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String username=field1.getText().trim();
				String password=field2.getText().trim();
				
				if(username.isEmpty()||password.isEmpty()) {
					System.out.println("Please enter username and password...");
					JOptionPane.showMessageDialog(rootPane, e);
					return;
				}
				
				try {
					PreparedStatement preparedStatement = GetConnection.getConnection().prepareStatement("insert into users (username,password) values (?,?)");
					preparedStatement.setString(1, username);
					preparedStatement.setString(2, password);
					
					int add=preparedStatement.executeUpdate();
					if(add>0) {
						System.out.println("Data Inserted SuccesFully...");
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
		new Signup();
	}
}
