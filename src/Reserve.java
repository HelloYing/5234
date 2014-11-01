import java.util.HashMap;

//reserveBike  viewReservation   updateReservation

public class Reserve {
private String userId;
private String beiginDate;
private String endDate;
private int totalDays;
private String pickupStation;
private String returnStation;
private String bikeType;
private double baseFee;
private String paymentType;//buckid,credit/debt card,points

public Reserve(HashMap<String,String>map)
{
	this.userId=map.get("userId");
	this.beiginDate=map.get("beginDate");
	this.endDate=map.get("endDate");
	this.pickupStation=map.get("pickuoStation");
	this.returnStation=map.get("returnStation");
	this.bikeType=map.get("bikeType");
	this.totalDays=Integer.valueOf(map.get("totalDays"));
	this.baseFee=Double.valueOf(map.get("baseFee"));
	this.paymentType=map.get("paymentType");
	
	
}
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public String getBeiginDate() {
	return beiginDate;
}
public void setBeiginDate(String beiginDate) {
	this.beiginDate = beiginDate;
}
public String getEndDate() {
	return endDate;
}
public void setEndDate(String endDate) {
	this.endDate = endDate;
}
public int getTotalDays() {
	return totalDays;
}
public void setTotalDays(int totalDays) {
	this.totalDays = totalDays;
}
public String getPickupStation() {
	return pickupStation;
}
public void setPickupStation(String pickupStation) {
	this.pickupStation = pickupStation;
}
public String getReturnStation() {
	return returnStation;
}
public void setReturnStation(String returnStation) {
	this.returnStation = returnStation;
}
public String getBikeType() {
	return bikeType;
}
public void setBikeType(String bikeType) {
	this.bikeType = bikeType;
}

public double getBaseFee() {
	return baseFee;
}
public void setBaseFee(double baseFee) {
	this.baseFee = baseFee;
}

public String getPaymentType() {
	return paymentType;
}
public void setPaymentType(String paymentType) {
	this.paymentType = paymentType;
}


}
