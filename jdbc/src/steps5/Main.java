package steps5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
class Operations{
	public void show( Statement statement) throws SQLException {
		ResultSet rs=statement.executeQuery("select * from emp");
		while (rs.next()) {
			System.out.print(rs.getInt(1)+" ");
			System.out.print(rs.getString(2));
			System.out.println();	
	}
		
  }
	public void insert(Connection connection, int id, String name) throws SQLException {
		PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO emp(id,name) VALUES (?,?)");
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		
		int rowsinserted=preparedStatement.executeUpdate();
		if(rowsinserted>0) {
			System.out.println("Data Inserted Successfully");
		}
	}
	public void delete(Connection connection, int id) throws SQLException {
		PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM emp where id=?");
		preparedStatement.setInt(1, id);
		
		int rowsdeleted=preparedStatement.executeUpdate();
		if(rowsdeleted>0) {
			System.out.println("data deleted successfully");
		}else {
			System.out.println("No employee with such id");
		}
	
	}
	public void update(Connection connection, int id, String name) throws SQLException {
		PreparedStatement preparedStatement = connection.prepareStatement("update emp set name=? where id=?");
		preparedStatement.setString(1, name);
		preparedStatement.setInt(2, id);
		
		int rowsupdated=preparedStatement.executeUpdate();
		if(rowsupdated>0) {
			System.out.println("data updated succuessfully");
		}else {
			System.out.println("No emp with such id");
		}
	}

}
public class Main {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "prem@1208");
		
		Statement statement = connection.createStatement();
		
		Operations operations = new Operations();
		
		operations.insert(connection, 3, "Om");
		operations.delete(connection, 3);
		operations.update(connection, 1, "Prem");
		operations.show(statement);
		
		connection.close();
		}
	}

