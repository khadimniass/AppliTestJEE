package login.submit.registration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CustomerDAOImplement implements CustomerDAO {

	static Connection con;
	static PreparedStatement ps;
	@Override
	public int insertCustomer(Customer c) {
	 int status=0;
	 try {
		con=MyconnectionProvier.getCon();
		ps=con.prepareStatement("INSERT INTO customer values(?,?)");
		ps.setString(1, c.getUsername());
		ps.setString(2, c.getPassword());
		ps.setString(3, c.getName());
		
		status=ps.executeUpdate();
		con.close();
		
	} catch (Exception e) {
	System.out.println(e);
	}
		return status;
	}

	@Override
	public Customer getCustomer(String username, String password) {
		Customer c =new Customer();

		try {
			con=MyconnectionProvier.getCon();
			ps=con.prepareStatement("SELECT * FROM customer where userid=? and password=?");
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				c.setUsername(rs.getString(1));
				c.setPassword(rs.getString(2));
				c.setName(rs.getString(3));
			}
			
		} catch (Exception e) {
		System.out.println(e);
		}
		return null;
	}

}
