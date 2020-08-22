package login.submit.registration;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyconnectionProvier implements MyProvider {
	static Connection con=null;

	public static Connection getCon() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url,username,password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

/*	public static void setCon(Connection con) {
		MyconnectionProvier.con = con;
	}*/
	
	
}
