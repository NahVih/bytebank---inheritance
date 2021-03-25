public class Director extends Employee implements PrivateEmployee {

	
		public double getBonus() {
			return super.getSalary() * 2;		
		}
		
		private Authenticator autentication;
		
		public Director() {
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
