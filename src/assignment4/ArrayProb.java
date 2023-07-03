package assignment4;

public class ArrayProb {
    public static void main(String[] args) {
        int[] arr = {1, 15, 8};
        System.out.println(sum(arr, arr.length - 1));

    }

    public static int sum(int[] arr, int n) {
        if (n == 0) {
            return arr[n];
        } else {
            return arr[n] + sum(arr, n - 1);
        }
    }
}
