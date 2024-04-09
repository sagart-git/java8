package com.sample.customcomparator;

import java.util.Comparator;

public class DescComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        //(x < y) ? -1 : ((x == y) ? 0 : 1);
        return o1.compareTo(o2);
    }
}
