import java.sql.*;

public class addressgateway {
	public void insertaddress(Address address) throws Exception{
		Class.forName("org.h2.Driver");
		   Connection conn = DriverManager.
		       getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
		   // add application code here
		   Statement stmt = conn.createStatement();
		   String context=""+address.getCountry()+", '"+address.getState()+"', '"+address.getCity()+", '"+address.getStreet()+", '"+address.getNo()+", '"+address.getRoom()+"'";
		   System.out.println(context);
		   stmt.execute("insert into address values("+context+")");
		   System.out.println("Address inserts done.");
	}
	public void searchaddress(Address address) throws Exception{
		Class.forName("org.h2.Driver");
		   Connection conn = DriverManager.
		       getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
		   // add application code here
		   Statement stmt = conn.createStatement();
		   String context="username='"+profile.getUserName()+"',firstname='"+profile.getFirstName()+"', lastname='"+profile.getLastName()+"', phone='"
		         +profile.getPhone()+"', email='"+profile.getEmail()+"'";
		   ResultSet num=stmt.executeQury("update profile set "+context+" where id="+profile.getProfileId());
		   System.out.println("Profile updates done.");
	}

}
