
public abstract class employe {
	
	private String name;
	private String tfn;
	private double salary;
	private int type = 0; // regular 0, manager 1, director 2
	
	public employe() {
		
	}
	
	public abstract double getBonus();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTfn() {
		return tfn;
	}
	public void setTfn(String tfn) {
		this.tfn = tfn;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}

}
