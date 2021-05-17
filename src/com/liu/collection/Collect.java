package com.liu.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Collect {
    public static void main(String[] args) {
        Collection<String> list=new ArrayList<>();
        list.add("妙啊01");
        list.add("密码02");
        System.out.println(list.size());
        System.out.println(list.isEmpty());
    }
}
