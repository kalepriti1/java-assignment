package com.stackroute;

public class BubbleSort {

    public BubbleSort() {
    }

    //return the answer as a string in the desired output format
    public static String countSwaps(int[] a) {
        int n=a.length;
        int c=0;
        for (int i = 0; i < n-1 ; i++) {
            for (int j = 0; j<n-1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    c=c+1;
                }
            }
        }
        String result = "Array is sorted in " + c + " swaps.\n" +
                "First Element: " + a[0] + "\n" +
                "Last Element: " + a[a.length-1];
        return result;
    }

}
