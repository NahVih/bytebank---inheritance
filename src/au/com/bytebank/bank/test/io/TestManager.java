package au.com.bytebank.bank.test.io;
import au.com.bytebank.bank.main.Manager;

public class TestManager {
	public static void main(String[] args) {
		Manager Will = new Manager();
		Will.setName("Will Smith");
		Will.setTfn("15782227823");
		Will.setSalary(9500.0);
		Will.setPassword(222);
		
		System.out.println(Will.getName());
		System.out.println(Will.getTfn());
		System.out.println(Will.getSalary());
		System.out.println(Will.getBonus());
		
		boolean autentication = Will.autentication(222);
		System.out.println(autentication);
		
		System.out.println(Will.getSalary());
		System.out.println(Will.getBonus());
		System.out.println(Will.getName());
		
	}
}
