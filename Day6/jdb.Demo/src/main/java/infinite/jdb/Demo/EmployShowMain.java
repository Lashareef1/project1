package infinite.jdb.Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployShowMain {

	
 public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/infinite","root","india@123");
		System.out.println("Connected...");
		String cmd = "select * from Employ";
		PreparedStatement pst = con.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		while(rs.next())  {
			System.out.println("Employ No "+rs.getInt("empno"));
			System.out.println("Name" +rs.getString("name"));
			System.out.println("Department" +rs.getString("dept"));
			System.out.println("Designation " +rs.getString("desig"));
			System.out.println("Basic " +rs.getInt("basic"));
			System.out.println("-------------------_");
		}
	} catch (ClassNotFoundException e) {

		e.printStackTrace();
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	
}
}
