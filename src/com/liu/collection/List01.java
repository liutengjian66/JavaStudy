package com.liu.collection;


import java.util.ArrayList;
import java.util.List;

public class List01 {
    public static void main(String[] args) {
        List<String> list01 =new ArrayList<>();
        list01.add("the first");
        list01.add("the second");
        list01.add("the third");
        System.out.println(list01);
        list01.add(1,"插队");
        System.out.println(list01);

        list01.set(1,"再改");
        System.out.println(list01);
        list01.remove(1);
        System.out.println(list01);
        System.out.println(100>>1);

    }

}
