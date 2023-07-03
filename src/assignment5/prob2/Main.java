package assignment5.prob2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	    System.out.print("Please, Enter y for : \n");
		String input = sc.nextLine();

		if("Y".equals(input) || "y".equals(input)) {
			
//			public Professor(String name, LocalDate hiredate, double salary, int numberOfPublications) {
//			public Secretary(String name, LocalDate hiredate, double salary, double overtimeHours) {

			DeptEmployee obj1 = new Professor("Ranjan Paul", LocalDate.parse("1989-07-01"), 250000.00, 1);
			DeptEmployee obj2 = new Professor("Shymal Paul", LocalDate.parse("1999-08-01"), 150000.00, 11);
			DeptEmployee obj3 = new Professor("Bhakti rani Paul", LocalDate.parse("1999-08-01"), 350000.00, 18);
			DeptEmployee obj4 = new Secretary("Monisha Paul", LocalDate.parse("2001-04-11"), 550000.00, 14);
			DeptEmployee obj5 = new Secretary("Niladri Paul", LocalDate.parse("1989-07-01"), 650000.00, 14);
			
			DeptEmployee[] arr = {obj1, obj2, obj3,obj4,obj5};

			double totalSalary = 0.0;

			for(DeptEmployee obj:arr) {
				
                totalSalary += obj.computeSalary();

			}
            System.out.println("Total salary: " + totalSalary);

		}
		
	}

}
