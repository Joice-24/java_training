package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	public static void main(String[] args) {
		String URL = "jdbc:mysql://localhost:3306/joice";
		String USERNAME = "root";
		String PASSWORD = "";
		try {
			Connection connect =DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("Connected successfully!!");
//			String insertQ ="insert into studentdetails value (?,?,?);";
//			PreparedStatement ps = connect.prepareStatement(insertQ);
//			
//			ps.setInt(1, 555);
//			ps.setString(2, "jo");
//			ps.setInt(3,3);
//			
//			ps.executeUpdate();
//			System.out.println("Data stored successfuly");	
			
			String squery = "SELECT *FROM studentdetails;";
			Statement st = connect.createStatement();
			ResultSet res = st.executeQuery(squery);
			while(res.next()); {
				System.out.print("Rollno:" + res.getInt(1) +" ,");
				System.out.print("Student Name:" + res.getString(2)+" ,");
				System.out.print("Department:" + res.getString(3)+" ,");
				System.out.println();
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();

		}

	}

}
