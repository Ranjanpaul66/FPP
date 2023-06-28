package assignment3;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        String status="Y";
        Scanner sc1 = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Please, Enter C for Circle \n");
            System.out.println("Please, Enter R for Rectangle \n");
            System.out.println("Please, Enter T for Triangle \n");

            String input = sc.nextLine();
            switch (input) {

                case "R":

                    System.out.println("Enter the width of the Rectangle");
                    double width = sc.nextDouble();

                    System.out.println("Enter the height of the Rectangle");
                    double height = sc.nextDouble();

                    Rectangle re = new Rectangle(width,height);
                    double area = re.computeArea();

                    System.out.printf("The area of Rectangle is : %f",area);

                    break;

                case "C":

                    System.out.println("Enter the radius of the Circle\n");
                    double radius = sc.nextDouble();
                    Circle cr = new Circle(radius);
                    double crArea = cr.computeArea();
                    System.out.printf("The area of Circle is : %f",crArea);
                    break;

                case "T":

                    System.out.println("Enter the width of the Triangle\n");
                    double widthT = sc.nextDouble();

                    System.out.println("Enter the height of the Triangle\n");
                    double heightT = sc.nextDouble();

                    Triangle ta = new Triangle(widthT,heightT);
                    double areaT = ta.computeArea();

                    System.out.printf("The area of Triangle is : %f",areaT);

                    break;
                default:

                    System.out.println("Wrong Input");
                    continue;
            }
            System.out.println("\nDo u want to continue this?, if Yes than Press Y else N ");

            status = sc1.nextLine();

        }while (status.equals("Y"));



    }

}
