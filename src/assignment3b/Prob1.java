package assignment3b;

public class Prob1 {
    private static Prob1 instance=null;
    private static Prob1 instance2=null;
    private static Prob1 instance3=null;

    private Prob1(){
    }


    public static Prob1 getInstance1(){
        if(instance==null){
            instance = new Prob1();
        }
        return instance;
    }
    public static Prob1 getInstance2(){
        if(instance2==null){
            instance2 = new Prob1();
        }
        return instance2;
    }
    public static Prob1 getInstance3(){
        if(instance3==null){
            instance3 = new Prob1();
        }
        return instance3;
    }

    public static void main(String[] args) {
        System.out.println(Prob1.getInstance1());
        System.out.println(Prob1.getInstance2());
        System.out.println(Prob1.getInstance3());

    }
}
