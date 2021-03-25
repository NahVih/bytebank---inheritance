
public class TestEmploye {
	public static void main(String[] args) {
		Adm Piter = new Adm();
		Piter.setName("Piter Parker");
		Piter.setTfn("15789657823");
		Piter.setSalary(4500.0);
		
		System.out.println(Piter.getName());
		System.out.println(Piter.getSalary());
		System.out.println(Piter.getBonus());
		
		Adm Will = new Adm();
		Will.setName("Will Smith");
		Will.setTfn("15782227823");
		Will.setSalary(9500.0);
		Will.setType(1);
		
		System.out.println(Will.getName());
		System.out.println(Will.getSalary());
		System.out.println(Will.getBonus());
		System.out.println(Will.getSalary());

		
		Adm Thiago = new Adm();
		Thiago.setName("Thiago Spider");
		Thiago.setTfn("15784337823");
		Thiago.setSalary(15500.0);
		Thiago.setType(2);
		
		System.out.println(Thiago.getName());
		System.out.println(Thiago.getSalary());
		System.out.println(Thiago.getBonus());
	}
}
