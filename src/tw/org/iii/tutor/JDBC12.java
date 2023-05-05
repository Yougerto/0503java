package tw.org.iii.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.Scanner;

import tw.org.iii.myclasses.BCrypt;
import tw.org.iii.myclasses.Member;

public class JDBC12 {
	private static final String USER = "root";
	private static final String PASSWORD = "root";
	private static final String URL = "jdbc:mysql://localhost/uuu";
//	private static final String SQL_LOGIN = 
//		"SELECT * FROM member WHERE account = ?";

	public static void main(String[] args) {
		String sql = 
				"select e.FirstName, e.LastName, sum(od.UnitPrice * od.Quantity) sum "
				+ "from orders o "
				+ "join employees e on (o.EmployeeID = e.EmployeeID) "
				+ "join orderdetails od on (o.OrderID = od.OrderID) "
				+ "GROUP by e.EmployeeID "
				+ "ORDER by sum desc";
		Properties prop = new Properties();
		prop.put("user", USER); prop.put("password", PASSWORD);
		try {
			Connection conn = DriverManager.getConnection(URL, prop);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("Firstname") + ":" + rs.getString("sum"));
			}

		}catch(Exception e) {
			System.out.println(e);
		}
	}
	

}