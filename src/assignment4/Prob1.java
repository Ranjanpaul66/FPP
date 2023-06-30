package assignment4;

public class Prob1 {
    private Prob1(){
    }


    public static Prob1 getInstance1(){

        return new Prob1();
    }
    public static Prob1 getInstance2(){
        return new Prob1();
    }
    public static Prob1 getInstance3(){
        return new Prob1();
    }

    public static void main(String[] args) {
        System.out.println(Prob1.getInstance1());
        System.out.println(Prob1.getInstance2());
        System.out.println(Prob1.getInstance3());

    }
}
