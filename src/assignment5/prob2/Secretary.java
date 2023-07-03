package assignment5.prob2;

import java.time.LocalDate;

public class Secretary extends DeptEmployee {
	
	private double overtimeHours;

	public Secretary(String name, LocalDate hiredate, double salary, double overtimeHours) {
		super(name, hiredate, salary);
		this.overtimeHours = overtimeHours;
	}
	
	@Override
	public double computeSalary() {
		return super.computeSalary()+12*overtimeHours;
	}
	

}
