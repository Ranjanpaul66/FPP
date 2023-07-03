package assignment3b;

public class Main {
    public static void main(String[] args) {

        /**
         * The code defines a class called Prob2. The class has two instance fields, id and name, one static field, counter, two instance methods, printId() and printId2(),
         * two static methods, printCounter() and printCounter2(), two instance initialization blocks, and two static initialization blocks.
         * The first static initialization block prints the following message: Static initialization block 1
         * The second static initialization block prints the following message: Static initialization block 2
         * The first instance initialization block prints the following message: Instance initialization block 1
         * The constructor with two parameters takes an int value for the id field and a String value for the name field. It then assigns the values to the corresponding fields and prints the following message: Constructor 1
         * The constructor without any parameters assigns the next value of counter to the id field and the string "No name" to the name field. It then prints the following message: Constructor 2
         * he method printId() prints the value of the id field.
         *
         * The method printId2() also prints the value of the id field.
         *
         * The method printCounter() prints the value of the static field counter.
         *
         * The method printCounter2() also prints the value of the static field counter.
         *
         * The main method creates two objects of the class Prob2, one with two parameters and one without any parameters. It then calls the printId() method on each object and the printCounter() method.
         *
         * The output of the program will be:
         * Static initialization block 1
         * Static initialization block 2
         * Instance initialization block 1
         * Constructor 1
         * Instance initialization block 1
         * Constructor 2
         * ID: 1
         * ID: 0
         * Counter: 1
         * Counter: 1
         */
        Prob2 myClass1 = new Prob2(1, "John Doe");
        Prob2 myClass2 = new Prob2();

        myClass1.printId();
        myClass2.printId();

        Prob2.printCounter();
        Prob2.printCounter2();

    }
}
