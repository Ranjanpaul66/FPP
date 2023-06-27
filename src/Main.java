import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner sc =  new Scanner(System.in);
        System.out.println("Type your Name: ");
        System.out.println("You wrote: " + sc.nextLine());
        System.out.println("Type your age: ");
        System.out.println(" your age: " + sc.nextInt());
        sc.close();

        System.out.println("hello Ranjan");
    }
}