package com.geekfed.problems;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by cody on 3/24/16.
 */
public class LargestElementInListTest {

    private Integer[] mSortedList = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    private Integer[] mUnsortedList = {0, 2, 10, 3, 4, 1, 5, 6, 7, 8, 9};

    @Test
    public void test_LargestElementInListSortedList() {
        ArrayList<Integer> testList = new ArrayList<Integer>(Arrays.asList(mSortedList));
        assertEquals(10, LargestElementInList.getLargestElement(testList));
    }

    @Test
    public void test_LargestElementInListUnsortedList() {
        ArrayList<Integer> testList = new ArrayList<Integer>(Arrays.asList(mUnsortedList));
        assertEquals(10, LargestElementInList.getLargestElement(testList));
    }

    @Test
    public void test_LargestElementInListNullList() {
        assertEquals(-1, LargestElementInList.getLargestElement(null));
    }
}
