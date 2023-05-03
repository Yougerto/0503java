package tw.org.iii.tutor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("ok");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/iii?user=root&password=root");
			Statement stmt = conn.createStatement();
			String sql = "INSERT INTO cust (cname,tel,birthday) VALUES ('aa','123','1999-01-01')";
			stmt.execute(sql);
			if (stmt.execute(sql)) {
				System.out.println("Query");
				
			}else {
				System.out.println("update");
				
			}
			
			
			System.out.println("sqlok");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}

}
