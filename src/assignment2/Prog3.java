package assignment2;

import java.util.Arrays;

public class Prog3 {
    public static void main(String[] args) {
        String[] arr = {"horse","horse", "dog", "cat", "horse", "dog","tiger"};

        System.out.println(Arrays.toString(removeDups(arr)));

    }

    public static String[] removeDups(String[] arr) {
        StringBuilder finalSentence = new StringBuilder();

//        String newString="";
        for(int i = 0;i<arr.length;i++) {
            for(int j=0;j<arr.length;j++) {
                if(i==j) {
                    finalSentence.append(arr[j]);
                    finalSentence.append(",");
                    break;
                }
                if(arr[i]==arr[j]) {
                    break;
                }
            }

        }
        String[] str= finalSentence.toString().split(",");
        return str;
    }

}
