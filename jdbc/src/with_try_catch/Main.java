package with_try_catch;

import java.sql.DriverManager;
import java.sql.ResultSet;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		try (ResultSet rs=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "prem@1208").createStatement().executeQuery("select * from emp");
	){
			while (rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
