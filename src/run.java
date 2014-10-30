
public class run {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Parser p=new Parser();
        
		
        String filename="register.xml";
        String file="XMLfile/"+filename;
        User user=new User(p.parse(file));
        if(user.getFlag()){
            user.register();
            if(user.getFlag()){
            	filename="login1.xml";
                file="XMLfile/"+filename;
                User user1=new User(p.parse(file));
                //System.out.println("***"+user1.getEmail());
                user1.login();
                
                filename="login.xml";
                file="XMLfile/"+filename;
                User user2=new User(p.parse(file));
                user2.login();
                
                filename="profile.xml";
                file="XMLfile/"+filename;
                Profile profile=new Profile(p.parse(file));
                profile.setProfileId(user2.getUserId());
                profile.updateProfile();
            }        	
        }
	}
}
