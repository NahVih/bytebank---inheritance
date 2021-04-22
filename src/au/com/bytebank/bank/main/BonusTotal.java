package au.com.bytebank.bank.main;

public class BonusTotal {
	private double total;
	
	public void register(Employee f) {
		this.total += f.getBonus();
	}
	
	public double getTotal() {
		return total;
	}
}
