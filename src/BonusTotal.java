
public class BonusTotal {
	private double total;
	
	public void register(employe f) {
		this.total += f.getBonus();
	}
	
	public double getTotal() {
		return total;
	}
}
