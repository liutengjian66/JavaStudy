package com.liu.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class List02 {
    public static void main(String[] args) {
        List<String> list=new LinkedList<>();
        list.add("001");
        list.add("002");
        list.add("003");
        ListIterator<String > it=list.listIterator();
        it.next();
        System.out.println(it.previous());
        if (it.hasNext()) System.out.println(it.next());
    }
}
