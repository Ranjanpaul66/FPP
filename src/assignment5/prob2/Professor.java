package assignment5.prob2;

import java.time.LocalDate;

public class Professor extends DeptEmployee {

	private int numberOfPublications;
	public Professor(String name, LocalDate hiredate, double salary, int numberOfPublications) {
		super(name, hiredate, salary);
		this.numberOfPublications = numberOfPublications;
		
	}
	
	public int getNumberOfPublications() {
		return numberOfPublications;
	}
	
	public void setNumberOfPublications( int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}
	
	@Override
	public double computeSalary() {
		return super.computeSalary();
      
    }

	
}
