package steps5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "prem@1208");
		
		Statement statement = connection.createStatement();
		ResultSet rs=statement.executeQuery("select * from emp");
		while (rs.next()) {
			System.out.print(rs.getInt(1)+" *");
			System.out.print(rs.getString(2));
			System.out.println();
		}
		connection.close();
	}

}
