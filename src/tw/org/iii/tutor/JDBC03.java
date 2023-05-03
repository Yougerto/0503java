package tw.org.iii.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Properties;

public class JDBC03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			System.out.println("ok");
//		} catch (Exception e) {
//			System.out.println(e);
//		}
		
		try {
			Properties prop = new Properties();
			prop.put("user","root");
			prop.put("password","root");
//			Connection conn = DriverManager.getConnection(
//					"jdbc:mysql://localhost:3306/iii","root","root");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/iii",prop);
//			Statement stmt = conn.createStatement();
//			String sql = "INSERT INTO cust (cname,tel,birthday) VALUES ('aa','123','1999-01-01')";
//			String sql = "UPDATE cust SET cname = 'Tony' WHERE id = 4";
//			String sql = "DELETE FROM cust WHERE id = 3";
			String sql = "INSERT INTO cust (cname,tel,birthday) VALUES (?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,"UUU");
			pstmt.setString(2,"222");
			pstmt.setString(3,"1000-09-09");
			//			stmt.execute(sql);
			pstmt.executeUpdate();
//			int count =stmt.executeUpdate(sql);
			
			
			System.out.println("sqlok2");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}

}
