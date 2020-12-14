package homeworkFive;

public class HazardPay extends PayCalculator {

	public HazardPay(double baseRate) {
		super(baseRate);
		// TODO Auto-generated constructor stub
	}
public double getPay (double hours) {
	return super.getPay(hours)*1.5;
	
}
}
