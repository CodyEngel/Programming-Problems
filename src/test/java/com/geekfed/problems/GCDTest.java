package com.geekfed.problems;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by cody on 3/18/16.
 */
public class GCDTest {

    @Test
    public void test_NonRecursiveGCDOf48And18Is6() {
        assertEquals(6, GCD.nonRecursive(48, 18));
    }

    @Test
    public void test_RecursiveGCDOf48And18Is6() {
        assertEquals(6, GCD.recursive(48, 18));
    }
}