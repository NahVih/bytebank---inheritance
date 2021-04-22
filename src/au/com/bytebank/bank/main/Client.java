package au.com.bytebank.bank.main;

public class Client implements PrivateEmployee {

	private Authenticator autentication;
	
	public Client() {
		this.autentication = new Authenticator();
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
