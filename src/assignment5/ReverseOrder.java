package assignment5;

public class ReverseOrder {
    public static void main(String[] args) {
        int n = 5899;
        reverse(n);
    }

    public static void reverse(int n) {
        if (n == 0) {
            System.out.println();
        } else {
            System.out.print(n % 10);
            reverse(n / 10);
        }
    }
}
