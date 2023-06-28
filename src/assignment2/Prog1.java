package assignment2;

public class Prog1 {

    public static void main(String[] args) {

        // Case 1
        int randomResult =RandomNumbers.getRandomInt(1,9);
        System.out.println(randomResult);
        double powResult = Math.pow(Math.PI, randomResult);
        System.out.println(powResult);

        //case2
        int randomResult2 =RandomNumbers.getRandomInt(3,14);
        System.out.println(randomResult2);
        double powResult2 = Math.pow(randomResult2,Math.PI);
        System.out.println(powResult2);

    }

}