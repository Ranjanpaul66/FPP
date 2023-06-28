package assignment2;

public class Prog4 {

    public static void main(String[] args) {
        //		1.27, 3.881, 9.6
        float a= 1.27f, b=3.881f,c=9.6f;
        int result = (int)(a+b+c);
        System.out.println(result);
        int result2 = (int) Math.round(a+b+c);
        System.out.println(result2);
    }
}
