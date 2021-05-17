package com.liu.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set01 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        int i = 20;
        set.add(1);
        set.add(3);
        set.add(87);
        set.add(6);
        set.add(123);
        set.add(8);
        System.out.println(set);

    }
}
