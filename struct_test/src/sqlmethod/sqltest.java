package sqlmethod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class sqltest {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		String url = "jdbc:hsqldb:hsql://localhost:9001/mydb";
		String driver = "org.hsqldb.jdbcDriver";
		String user = "sa";
		String pass = "";	
	
		Class.forName(driver);
		String sql = "select * from stu where username =?";
		boolean isHave = false;
		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			pstmt.setString(1, "xsc");
			try (ResultSet rs = pstmt.executeQuery();) {
				isHave = rs.next();
				System.out.println(isHave);
			}
		}
		
	}
}
