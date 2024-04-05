package com.stackroute;


import java.util.Arrays;

public class App
{
    private static BubbleSort bubbleSort = new BubbleSort();

    public static void main( String[] args )
    {
        int[] a = {1,2,3,4,5};
        System.out.println(bubbleSort.countSwaps(a));

    }
}
