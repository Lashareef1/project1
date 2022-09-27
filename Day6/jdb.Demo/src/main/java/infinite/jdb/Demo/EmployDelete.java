package infinite.jdb.Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployDelete {

	public static void main(String[] args) {
	 int empno;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter Employ No");
	 empno = sc.nextInt();
	 
	 try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/infinite","root","india@123");
			String cmd = "delete from Employ where employ";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 

	}

}
