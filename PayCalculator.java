package homeworkFive;
public abstract class PayCalculator {
	public double payRate;
	public double getPay(double hours) {
		return hours*payRate;
		
	}
	public PayCalculator(double baseRate) {
		payRate=baseRate;
		
	}
	public double getPayRate() {
		return payRate;
}
	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}
}