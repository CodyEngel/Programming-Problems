package com.geekfed.problems;

/**
 * Created by cody on 3/18/16.
 */
public class GCD {

    public static int nonRecursive(int i, int j) {
        while(j != 0) {
            int temp = j;
            j = i % j;
            i = temp;
        }
        return i;
    }

    public static int recursive(int i, int j) {
        if(j == 0) {
            return i;
        }
        return recursive(j, i % j);
    }
}
