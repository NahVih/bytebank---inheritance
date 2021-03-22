
public class testBonusTotal {
	public static void main(String[] args) {
		manager Will = new manager();
		Will.setName("Will Smith");
		Will.setTfn("15782227823");
		Will.setSalary(9500.0);
		Will.setPassword(222);
		
		System.out.println(Will.getSalary());
		System.out.println(Will.getBonus());
		
		employe Piter = new employe();
		Piter.setName("Piter Smith");
		Piter.setTfn("22282227823");
		Piter.setSalary(1500.0);
		
		System.out.println(Piter.getSalary());
		System.out.println(Piter.getBonus());
		
		BonusTotal control = new BonusTotal();
		control.register(Piter);
		control.register(Will);
		
		System.out.println(control.getTotal());
		
	}
}
