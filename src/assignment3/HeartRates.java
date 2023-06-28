package assignment3;
import java.time.Period;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HeartRates {
    final double RHR=70d;
    final double LB=0.5d;
    final double UB=0.85d;

    private String firstName;
    private String lastName;
    private LocalDate DOB;


    public HeartRates(String firstName, String lastName, LocalDate dOB) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = dOB;
        System.out.println(DOB+" in constr");
    }


    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public LocalDate getDOB() {
        return DOB;
    }


    public void setDOB(LocalDate dOB) {
        DOB = dOB;
    }


    public double getRHR() {
        return RHR;
    }


    public double getLB() {
        return LB;
    }


    public double getUB() {
        return UB;
    }


    public int ageCalculator() {
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate+", "+getDOB());
        Period age = Period.between(DOB, currentDate);
        return age.getYears();
    }

    public int maxHeartRate() {
        int age = ageCalculator();
        int maxRate = 220 - age;
        return maxRate;
    }



    public double lbthr() {
        double avrgHR =(double)(maxHeartRate()) - RHR;

        double LBTHR = (int) (avrgHR * LB) + RHR;

        return LBTHR;
    }

    public double ubthr() {

        double avrgHR =(maxHeartRate()) - RHR;

        double UBTHR =  (avrgHR * UB) + RHR;

        System.out.println("Target Heart Rate Range:");
        System.out.println("Upper Boundary: " + UBTHR);
        return UBTHR;
    }

    @Override
    public String toString() {
        return "First Name: " + firstName + "\nLast Name : " + lastName +
                "\nAge: " + ageCalculator() +
                "\nThe target heart Rate Range is between "+ lbthr()+ " and "+ubthr()+
                "\nDate of Birth: " + DOB +
                "\nMaximum Heart Rate: " + maxHeartRate();
    }



}
