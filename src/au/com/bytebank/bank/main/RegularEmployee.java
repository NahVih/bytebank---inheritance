package au.com.bytebank.bank.main;

public class RegularEmployee extends Employee implements PrivateEmployee {
	
	private Authenticator autentication;


	@Override
	public boolean autentication(int password) {
		return this.autentication.getAutentication(password);
	}

	@Override
	public int getPassword(int password) {
		return password;
	}

	@Override
	public void setPassword(int password) {
		this.autentication.setPassword(password);
		
	}

	@Override
	public double getBonus() {
		return super.getSalary();
	}

}
