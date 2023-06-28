package assignment2;

public class Prog6 {

    public static int min(int[] arrayOfInts) {
        int lastValue=arrayOfInts[0];
        int minvalue = arrayOfInts[0];
        for(int i=1;i<arrayOfInts.length;i++) {
            if(arrayOfInts[i]<lastValue) {
                minvalue = arrayOfInts[i];
                lastValue = arrayOfInts[i];
            }
            else {
                minvalue = lastValue;
            }
        }
        return minvalue;
    }

    public static void main(String[] args) {

        int[] arr = new int[] {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
        System.out.println(min(arr));
    }
}
