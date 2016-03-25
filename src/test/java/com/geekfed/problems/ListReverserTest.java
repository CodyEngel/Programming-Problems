package com.geekfed.problems;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by cody on 3/24/16.
 */
public class ListReverserTest {

    private ArrayList<Integer> testEvenListInput = new ArrayList<Integer>(Arrays.asList(
        0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
    ));

    private ArrayList<Integer> testEvenListOutput = new ArrayList<Integer>(Arrays.asList(
            10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0
    ));

    private ArrayList<Integer> testOddListInput = new ArrayList<Integer>(Arrays.asList(
            0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
    ));

    private ArrayList<Integer> testOddListOutput = new ArrayList<Integer>(Arrays.asList(
            10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0
    ));

    @Test
    public void test_ListReverserEvenBruteForce() {
        assertEquals(testEvenListOutput, ListReverser.bruteForce(testEvenListInput));
    }

    @Test
    public void test_ListReverserOddBruteForce() {
        assertEquals(testOddListOutput, ListReverser.bruteForce(testOddListInput));
    }

    @Test
    public void test_ListReverserEvenInPlace() {
        assertEquals(testEvenListOutput, ListReverser.inPlace(testEvenListInput));
    }

    @Test
    public void test_ListReverserOddInPlace() {
        assertEquals(testOddListOutput, ListReverser.inPlace(testOddListInput));
    }
}
