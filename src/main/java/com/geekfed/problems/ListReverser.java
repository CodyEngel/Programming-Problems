package com.geekfed.problems;

import java.util.ArrayList;

/**
 * Created by cody on 3/24/16.
 */
public class ListReverser {

    public static ArrayList<Integer> bruteForce(ArrayList<Integer> list) {
        ArrayList<Integer> returnList = new ArrayList<Integer>();

        for(int i = list.size() - 1; i >= 0; i-- ) {
            returnList.add(list.get(i));
        }

        return returnList;
    }

    public static ArrayList<Integer> inPlace(ArrayList<Integer> list) {
        for(int i = 0, j = list.size() - 1; i < j; i++, j--) {
            int temp = list.get(j);
            list.set(j, list.get(i));
            list.set(i, temp);
        }

        return list;
    }
}
