
public class Manager extends Employee implements PrivateEmployee {
	
	private Authenticator autentication;
	
	public Manager() {
		this.autentication = new Authenticator();
	}
	
	public double getBonus() {
		return super.getSalary() * 2;		
	}
	
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

}
