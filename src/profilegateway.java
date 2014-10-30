import java.sql.*;

public class profilegateway {
	public void insertprofile(User user) throws Exception{
		Class.forName("org.h2.Driver");
		   Connection conn = DriverManager.
		       getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
		   // add application code here
		   Statement stmt = conn.createStatement();
		   String context=""+user.getUserId()+", '"+user.getEmail()+"', '"+user.getPassWord()+"'";
		   System.out.println(context);
		   stmt.execute("insert into profile values("+context+", null, null, null, null, null, null, 0, 10)");
		   System.out.println("Profile inserts done.");
	}
	
	public void updateprofile(Profile profile) throws Exception{
		Class.forName("org.h2.Driver");
		   Connection conn = DriverManager.
		       getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
		   // add application code here
		   Statement stmt = conn.createStatement();
		   String context="username='"+profile.getUserName()+"',firstname='"+profile.getFirstName()+"', lastname='"+profile.getLastName()+"', phone='"
		         +profile.getPhone()+"', email='"+profile.getEmail()+"'";
		   stmt.execute("update profile set "+context+" where id="+profile.getProfileId());
		   System.out.println("Profile updates done.");
	}

}
