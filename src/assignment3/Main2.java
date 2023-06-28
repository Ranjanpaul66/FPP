package assignment3;
import java.time.LocalDate;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, Enter your first name: \n");
        String fName = scanner.nextLine();

        System.out.print("Please Enter last name: \n");
        String lName = scanner.nextLine();

        System.out.print("Please, Enter your DOB in this formate (yyyy-mm-dd): ex: 1989-09-14 \n");
        LocalDate dob = LocalDate.parse(scanner.nextLine());
        System.out.println("testing "+dob);
        HeartRates heartRateObj = new HeartRates(fName, lName, dob);

        System.out.println(heartRateObj);


        scanner.close();
    }

}
