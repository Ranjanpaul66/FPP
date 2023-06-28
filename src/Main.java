import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        Scanner sc =  new Scanner(System.in);
//        System.out.println("Type your Name: ");
//        System.out.println("You wrote: " + sc.nextLine());
//        System.out.println("Type your age: ");
//        System.out.println(" your age: " + sc.nextInt());
//        sc.close();
//
//        System.out.println("hello Ranjan");

        // betwees operator

//        int num1 = 4;
//        int num2=5;
//
//        int result = num1 & num2;
//
//        int xor = num1 ^ num2;
//
//        int or = num1 | num2;
//        System.out.println(result);
//        System.out.println(xor);
//        System.out.println(or);


//        int value =3;
//        int complementvalue = ~value;
//        System.out.println("value "+ value + " complementedValue: "+ complementvalue);
//        System.out.println("Binary of the value: "+ Integer.toBinaryString(value));
//        System.out.println("Binary of the complemented value: "+ Integer.toBinaryString(complementvalue));

//        int value =12;
//
//        int leftShift = value<<2;
//        System.out.println("Num: "+ value+ " left shift by 2=  "+ leftShift);
//        System.out.println("Binary of the num value: "+ Integer.toBinaryString(value));
//        System.out.println("Binary of the num left shifted value: "+ Integer.toBinaryString(leftShift));
//
//        int rightShift = value>>2;
//        System.out.println("Num: "+ value+ "Right shift by 2= "+ rightShift);
//        System.out.println("Binary of the num value: "+ Integer.toBinaryString(value));
//        System.out.println("Binary of the num right shifted value: "+ Integer.toBinaryString(rightShift));


//        String name = "Ranjan Paul";
//
//        System.out.println(name.substring(1,5));
//        System.out.println(name.substring(1,name.length()));
//        System.out.println(name.substring(0,0));

//        System.out.println(name.indexOf("R"));
//        System.out.println(name.indexOf('R'));
//
//        System.out.println(name.indexOf("nja"));
//
//        System.out.println(name.startsWith("Ranja"));
//        System.out.println(name.startsWith("anja"));
//        System.out.println(name.startsWith("Paul"));
//
//        String lastName = "MIU";
//
//        System.out.println(name + lastName);


//        System.out.println(name.equals("Ranjan"));
//        System.out.println(name.equals("Ranjan Paul"));
//        System.out.println(name == "Ranjan Paul");
//        String newName = new String("Ranjan");
//        System.out.println(name == "Ranjan");
//        newName.equals("Ranjan");



        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = new String("Hello");
        String str5 = str4;
        System.out.println(str1==str2);
        System.out.println(str2==str3);
        System.out.println(str3==str4);
        System.out.println(str4==str5);



        System.out.println("a".compareTo("b"));
        System.out.println("b".compareTo("a"));
        System.out.println("a".compareTo("a"));

        int aa = 'A';
        int ba = 'B';

        System.out.println(aa);
        System.out.println(ba);

        String sentance = "I am Ranjan,I am studying COMPRO from MAY intake";
//        sentance.split(" ");

        System.out.println( Arrays.toString(sentance.split(" |,")));



    }
}