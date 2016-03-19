package com.geekfed.problems;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by cody on 3/18/16.
 */
public class GCDTest {

    // Non-recursive
    @Test
    public void test_NonRecursiveGCDTrickCase() {
        assertEquals(13, GCD.nonRecursive(13, 13));
    }

    @Test
    public void test_NonRecursiveGCDWithPrimeArgument() {
        assertEquals(1, GCD.nonRecursive(37, 600));
    }

    @Test
    public void test_NonRecursiveGCDWithMultiplumOfOther() {
        assertEquals(10, GCD.nonRecursive(10, 1000));
    }

    @Test
    public void test_NonRecursiveGCDNormalCase() {
        assertEquals(6, GCD.nonRecursive(54, 24));
    }

    // Recursive
    @Test
    public void test_RecursiveGCDTrickCase() {
        assertEquals(13, GCD.recursive(13, 13));
    }

    @Test
    public void test_RecursiveGCDWithPrimeArgument() {
        assertEquals(1, GCD.recursive(37, 600));
    }

    @Test
    public void test_RecursiveGCDWithMultiplumOfOther() {
        assertEquals(10, GCD.recursive(10, 1000));
    }

    @Test
    public void test_RecursiveGCDNormalCase() {
        assertEquals(6, GCD.recursive(54, 24));
    }
}