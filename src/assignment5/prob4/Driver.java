package assignment5.prob4;

public class Driver {
    public static void main(String[] args) {
        Employee[] employees = {
                new CommissionEmployee("Ranjan", "Paul", "85884", 10044, 0.70),
                new BasePlusCommissionEmployee("Monisha", "Paul", "91809", 7800, 0.1, 1000),
                new HourlyEmployee("Test Millar", "Junior", "52", 741, 8),
                new SalariedEmployee("Kat william", "Elledge", "1754", 1000)
        };

        System.out.println("Current Status of Employee is ");

        for (Employee emp : employees) {
            System.out.println(emp);
        }

        double totalPayment = 0;

        for (Employee emp : employees) {
            totalPayment += emp.getPayment();
        }

        System.out.println("\nTotal Payment is " + totalPayment);
    }
}