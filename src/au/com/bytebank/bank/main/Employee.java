package au.com.bytebank.bank.main;

import java.io.Serializable;

public abstract class Employee implements Serializable{
	
	private String name;
	private String tfn;
	private String job;
	private double salary;
	
	public Employee() {
		
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

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

}
