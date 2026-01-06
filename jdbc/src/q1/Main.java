package q1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class Crud{
	public void show(Statement statement) throws SQLException {
		ResultSet resultSet=statement.executeQuery("select * from info");
		while(resultSet.next()) {
			System.out.println("Name:"+resultSet.getString(1));
			System.out.println("ID:"+resultSet.getInt(2));
			System.out.println("Contact:"+resultSet.getString(3));
		}

	}
	
	public void showByID(Connection connection,int id) throws SQLException {
		PreparedStatement preparedStatement = connection.prepareStatement("select * from info where id=?");
		preparedStatement.setInt(1, id);
		ResultSet rs=preparedStatement.executeQuery();
		if(rs.next() && (id==rs.getInt(2))) {
			System.out.println("Name:"+rs.getString(1));
			System.out.println("ID:"+rs.getInt(2));
			System.out.println("Contact:"+rs.getString(3));
		}else {
			System.out.println("No info with this ID:"+id);
		}

	}
}

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/dem1", "root", "prem@1208");
		
		Statement statement =con.createStatement();
		
		Crud crud = new Crud();
		crud.show(statement);
		crud.showByID(con, 4);
		
		
	}

}
