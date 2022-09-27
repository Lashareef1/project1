package com.infinite.JdbcRealTime;

import java.sql.SQLException;
import java.util.Scanner;

public class UpdateMain {

	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Employ employ= new Employ();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ No ");
		employ.setEmpno(sc.nextInt());
		System.out.println("Enter Employ Name  ");
		employ.setName(sc.next());
		System.out.println("Enter Department  ");
		employ.setDept(sc.next());
		System.out.println("Enter designation  ");
		employ.setDesig(sc.next());
		System.out.println("Enter Basic ");
		employ.setBasic(sc.nextInt());
		System.out.println(new EmployDAO().updateEmploy(employ));
		
	}
}
