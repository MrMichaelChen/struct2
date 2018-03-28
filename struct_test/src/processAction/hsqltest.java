package processAction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import org.hsqldb.jdbcDriver;

public class hsqltest {
	public static void main(String[] args) {
		try {
			Class.forName("org.hsqldb.jdbcDriver");
			Connection c = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost:9001/mydb", "sa", "");
			if (c != null) {
				System.out.println("Connected db success!");
				String sql = "CREATE TABLE USERS(ID INTEGER, BIRTHDAY DATE);";
				Statement st = c.createStatement();
				st.execute(sql);
				sql = "INSERT INTO USERS(ID, BIRTHDAY) VALUES ('1', SYSDATE);";
				st.executeUpdate(sql);
				System.out.println("Insert db success!");
				if (st != null) {
					st.close();
				}
				c.close();
			}
		} catch (Exception e) {
			System.out.println("ERROR:failed to load HSQLDB JDBC driver.");
			e.printStackTrace();
			return;
		}
	}
}
