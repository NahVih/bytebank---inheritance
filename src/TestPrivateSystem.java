
public class TestPrivateSystem {

	public static void main(String[] args) {
		Manager Paulo = new Manager();
		Paulo.setPassword(2222);
		PrivateSystem ps = new PrivateSystem();
		ps.autentication(Paulo);
		
		Director Andre = new Director();
		Andre.setPassword(22222);
		PrivateSystem ps2 = new PrivateSystem();
		ps2.autentication(Andre);
	}
}
