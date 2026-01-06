package q2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class Login{
	public void signUp(Connection connection,String username,String password)  {
		
		try {
			 PreparedStatement preparedStatement = connection.prepareStatement("insert into users(username,password) values(?,?)");
			
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			
			int rowadded=preparedStatement.executeUpdate();
			if(rowadded>0) {
				System.out.println("Signup Successful");
			}else {
				System.out.println("Signup Failed");
			}

		} catch (SQLException e) {
			System.out.println("Already registered with this username");
			
		}
	}
	
	public void userLogin(Connection connection ,String username ,String password) throws SQLException {
	
			PreparedStatement preparedStatement =connection.prepareStatement("select * from users where username=?");
			preparedStatement.setString(1, username);
			ResultSet rs=preparedStatement.executeQuery();
			
			if(rs.next()) {
				String dbpassword=rs.getString(2);
				if(dbpassword.equals(password)) {
					System.out.println("Login SucessFul");
				}else {
					System.out.println("Incorrect Password");
				}
			}else {
				System.out.println("User not found,please signup!!");
			}
	

	}
}

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/q2", "root", "prem@1208");
		Login login = new Login();
		login.signUp(connection, "yash", "1234");
		login.userLogin(connection, "prem", "01234");
	}
}	
		

