import java.util.HashMap;

public class Profile {
private int profileId;
private String userName;
private String password;
private String firstName;
private String lastName;
private String birthday;
private String phone;
private String email;
private int addressId;
private double balance;
private int point;

public Profile(HashMap<String, String> map)
{
	if(map.containsKey("username")){
		this.userName=map.get("username");
	}
	if(map.containsKey("password")){
		this.setPassword(map.get("password"));
	}
	if(map.containsKey("firstname")){
		this.firstName=map.get("firstname");
	}
	if(map.containsKey("lastname")){
		this.lastName=map.get("lastname");
	}
	if(map.containsKey("birthday")){
		this.birthday=map.get("birthday");
	}
	if(map.containsKey("email")){
		String email=map.get("email");
		if(!email.contains("@")){
			System.out.println("Wrong email format.");
		}else{
			this.email=email;
		}
	}
	if(map.containsKey("phone")){
		this.phone=map.get("phone");
	}
	if(map.containsKey("balance")){
		this.setBalance(Double.parseDouble(map.get("balance")));
	}
	if(map.containsKey("point")){
		this.setPoint(Integer.parseInt(map.get("point")));
	}	
}

public void updateProfile() throws Exception
{
	profilegateway pg=new profilegateway();
	pg.updateprofile(this);
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getBirthday() {
	return birthday;
}
public void setBirthday(String birthday) {
	this.birthday = birthday;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public int getAddressId() {
	return addressId;
}
public void setAddressId(int addressId) {
	this.addressId = addressId;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public int getPoint() {
	return point;
}
public void setPoint(int point) {
	this.point = point;
}

public int getProfileId() {
	return profileId;
}

public void setProfileId(int profileId) {
	this.profileId = profileId;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

}
