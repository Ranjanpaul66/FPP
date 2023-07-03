package assignment3b;

public class Prob2 {

    private int id;
    private String name;
    private static int counter = 0;

    static {
        System.out.println("Static initialization block 1");
    }

    static {
        System.out.println("Static initialization block 2");
    }

    {
        System.out.println("Instance initialization block 1");
    }

    public Prob2(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Constructor 1");
    }

    public Prob2() {
        this.id = counter++;
        this.name = "No name";
        System.out.println("Constructor 2");
    }

    public void printId() {
        System.out.println("ID: " + id);
    }
    public void printId2() {
        System.out.println("ID: " + id);
    }

    public static void printCounter() {
        System.out.println("Counter: " + counter);
    }
    public static void printCounter2() {
        System.out.println("Counter: " + counter);
    }




}
