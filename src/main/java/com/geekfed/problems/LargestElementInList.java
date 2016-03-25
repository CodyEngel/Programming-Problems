package com.geekfed.problems;

import java.util.List;

/**
 * Created by cody on 3/24/16.
 */
public class LargestElementInList {

    public static int getLargestElement(List<Integer> list) {
        if(list == null) return -1;

        int largestInt = list.get(0);
        for(int i = 0; i < list.size(); i++) {
            if(largestInt < list.get(i)) {
                largestInt = list.get(i);
            }
        }

        return largestInt;
    }
}
