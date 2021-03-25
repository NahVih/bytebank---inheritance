//Composition
public class Authenticator {
	
	private int password;

	
	public boolean getAutentication(int password) {
		if(this.password == password) {
			return true;
		}
		else {
			return false;
		}
	}

	public int getPassword(int password) {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}
}
