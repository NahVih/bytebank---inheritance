package au.com.bytebank.bank.main;

public class PrivateSystem {
	
	private int password = 2222;
	
	public void autentication (PrivateEmployee g) {
		if(g.autentication(this.password)){
			System.out.println("Allowed");
		}
		else {
			System.out.println("Not allowed");
		};
	}
}
