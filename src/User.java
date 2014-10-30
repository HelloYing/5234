import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class User {

	private int userId;
	private String email;
	private String passWord;
	private boolean flag=true;
	private String sqlString;

	public String getPassWord() {
		return passWord;
	}


	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public boolean getFlag(){
		return flag;
	}
	
	public void setFlag(boolean flag){
		this.flag=flag;
	}
	
	public User(HashMap<String,String> map)
	{
		String SQL="email='";
		String email=map.get("email");
		String pattern ="[A-Za-z0-9]+@[A-Za-z0-9]+.[A-Za-z]+";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(email);
		if(m.find()){
			this.email=email;
			System.out.println(email);
		}else{
			System.out.println("Wrong email format!");
			this.setFlag(false);
		}
		if(map.containsKey("confirmedPassword")){
			if(map.get("password").equals(map.get("confirmedPassword"))){
				this.passWord=map.get("password");
			}else{
				System.out.println(map.get("password"));
				System.out.println(map.get("confirmedPassword"));
				System.out.println("Passwords do not match!");
				flag=false;
			}	
		}else{
			this.passWord=map.get("password");
		}
	}
	
	
	public  void register() throws Exception
	{
		usergateway ug=new usergateway();
        if(ug.insertuser(this)){
        	int id=ug.searchuserid(this);
            //System.out.println("id="+id);
            this.setUserId(id);
            profilegateway fg=new profilegateway();
            fg.insertprofile(this);
        }else{
        	System.out.println("This Email has been used.");
        	this.setFlag(false);
        }        
	}
	
	public void login() throws Exception
	{
		usergateway ug=new usergateway();
		int id=ug.searchuserid(this);
		if(id<=0){
			System.out.println("Wrong username or password, or please register first.");
		}else{
			this.setUserId(id);
			System.out.println("Login successfully! Welcome!");
		}
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSqlString() {
		return sqlString;
	}


	public void setSqlString(String sqlString) {
		this.sqlString = sqlString;
	}

}
