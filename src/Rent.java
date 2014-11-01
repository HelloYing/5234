import java.util.HashMap;

//rentBike  viewRent   updateRent

public class Rent {
private String userId;
private String beiginDate;
private String endDate;
private int totalDays;
private String pickupStation;
private String returnStation;
private String bikeType;
private String bikeId;
private double baseFee;
private double fine;
private double totalFee;
private String buckId;
private double moneyFromBuckId;
private String creditCardId;
private double moneyFromCard;
private double points;
private String paymentType;//buckid,credit/debt card,points

public Rent(HashMap<String,String>map)
{
	this.userId=map.get("userId");
	this.beiginDate=map.get("beginDate");
	this.endDate=map.get("endDate");
	this.pickupStation=map.get("pickuoStation");
	this.returnStation=map.get("returnStation");
	this.bikeType=map.get("bikeType");
	this.bikeId=map.get("bikeId");
	this.totalDays=Integer.valueOf(map.get("totalDays"));
	this.baseFee=Double.valueOf(map.get("baseFee"));
	this.fine=Double.valueOf(map.get("fine"));
	this.totalFee=Double.valueOf(map.get("totalFee"));
	this.paymentType=map.get("paymentType");
	this.buckId=map.get("buckId");
	this.moneyFromBuckId=Double.valueOf(map.get("moneyFromBuckId"));
	this.creditCardId=map.get("creditCardId");
	this.moneyFromCard=Double.valueOf(map.get("moneyFromCard"));
	this.points=Double.valueOf(map.get("points"));
	
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
public String getBikeId() {
	return bikeId;
}
public void setBikeId(String bikeId) {
	this.bikeId = bikeId;
}
public double getBaseFee() {
	return baseFee;
}
public void setBaseFee(double baseFee) {
	this.baseFee = baseFee;
}
public double getFine() {
	return fine;
}
public void setFine(double fine) {
	this.fine = fine;
}
public double getTotalFee() {
	return totalFee;
}
public void setTotalFee(double totalFee) {
	this.totalFee = totalFee;
}
public String getBuckId() {
	return buckId;
}
public void setBuckId(String buckId) {
	this.buckId = buckId;
}
public double getMoneyFromBuckId() {
	return moneyFromBuckId;
}
public void setMoneyFromBuckId(double moneyFromBuckId) {
	this.moneyFromBuckId = moneyFromBuckId;
}
public String getCreditCardId() {
	return creditCardId;
}
public void setCreditCardId(String creditCardId) {
	this.creditCardId = creditCardId;
}
public double getMoneyFromCard() {
	return moneyFromCard;
}
public void setMoneyFromCard(double moneyFromCard) {
	this.moneyFromCard = moneyFromCard;
}
public double getPoints() {
	return points;
}
public void setPoints(double points) {
	this.points = points;
}
public String getPaymentType() {
	return paymentType;
}
public void setPaymentType(String paymentType) {
	this.paymentType = paymentType;
}


}
