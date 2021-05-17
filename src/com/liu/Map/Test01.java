package com.liu.Map;

import java.util.HashMap;
import java.util.Map;

public class Test01 {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"001学生");
        System.out.println(map.put(1, "001老师"));
        System.out.println(map);

        Integer a=-128;
        Integer b=-128;
        System.out.println(a==b);
    }
}
