import java.sql.*;

public class usergateway {
	public boolean insertuser(User user) throws Exception{
		Class.forName("org.h2.Driver");
		   Connection conn = DriverManager.
		       getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
		   // add application code here
		   Statement stmt = conn.createStatement();
		   ResultSet res=stmt.executeQuery("select id from user where email='"+user.getEmail()+"'");
		   if(res.next()){
			   return false;
			   //System.out.println("Email has been used, please change another one.");
		   }else{
			   String context="null,'"+user.getEmail()+"', '"+user.getPassWord()+"'";
			   //System.out.println(context);
			   stmt.execute("insert into user values("+context+")");
			   System.out.println("Register Successful!");
			   return true;
		   }
		   
	}
	public int searchuserid(User user)throws Exception{
		int userid=-1;
		Class.forName("org.h2.Driver");
		   Connection conn = DriverManager.
		       getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
		   // add application code here
		   Statement stmt = conn.createStatement();
		   String context="email='"+user.getEmail()+"'and password='"+user.getPassWord()+"'";
		   //System.out.println(context);
		   ResultSet num=stmt.executeQuery("select id from user where "+context);
           if(num.next()){
        	   userid=num.getInt(1);
           }           
		   return userid;
	}
}
