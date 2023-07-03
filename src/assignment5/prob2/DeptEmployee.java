package assignment5.prob2;

import java.time.LocalDate;

public class DeptEmployee {
	private String name;
	private double salary;
	private LocalDate hiredate;
	
	public DeptEmployee(String name,LocalDate hiredate,double salary) {
		
		this.salary = salary;
		this.hiredate = hiredate;
		this.name = name;
	}
	
	
	
	String getName() {
		
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	LocalDate getHiredate() {
		return hiredate;
	}

	public void setHiredate(LocalDate hiredate) {
		this.hiredate = hiredate;
	}
	
	public double computeSalary() {
		
        return salary;
    }
	
}
