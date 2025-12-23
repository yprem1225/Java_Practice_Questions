package one_line;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		ResultSet rs=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "prem@1208").createStatement().executeQuery("select * from emp");
		while (rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			
		}
	}

}
