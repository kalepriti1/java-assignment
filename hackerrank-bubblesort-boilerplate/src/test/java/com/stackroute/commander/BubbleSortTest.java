package com.stackroute.commander;

import com.stackroute.BubbleSort;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {
    private BubbleSort bubbleSort = new BubbleSort();

    @Test
    public void givenSortedArrayTest(){
        int[] a = {1,2,3,4,5};
        String result = "Array is sorted in 0 swaps.\nFirst Element: 1" + "\nLast Element: 5";
        assertThat(bubbleSort.countSwaps(a), is(result));
    }

    @Test
    public void givenUnsortedArrayTest(){
        int[] a = {5,4,3,2,1};
        String result = "Array is sorted in 10 swaps.\nFirst Element: 1" + "\nLast Element: 5";
        assertThat(bubbleSort.countSwaps(a), is(result));
    }

    @Test
    public void givenRandomSortedArrayTest(){
        int[] a = {1,3,2,4,5};
        String result = "Array is sorted in 1 swaps.\nFirst Element: 1" + "\nLast Element: 5";
        assertThat(bubbleSort.countSwaps(a), is(result));
    }
}
