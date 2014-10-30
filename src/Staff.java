import java.util.HashMap;


public class Staff {
private String staffId;
private String staffName;
private String passWord;
private String accessId;//which part this staff can have access to
public String getStaffId() {
	return staffId;
}
public void setStaffId(String staffId) {
	this.staffId = staffId;
}
public String getStaffName() {
	return staffName;
}
public void setStaffName(String staffName) {
	this.staffName = staffName;
}
public String getPassWord() {
	return passWord;
}
public void setPassWord(String passWord) {
	this.passWord = passWord;
}
public String getAccessId() {
	return accessId;
}
public void setAccessId(String accessId) {
	this.accessId = accessId;
}

public Staff(HashMap<String,String> map)
{
	this.staffId=map.get("staffId");
	this.staffName=map.get("staffName");
	this.passWord=map.get("passWord");
	this.accessId=map.get("accessId");
}


}
