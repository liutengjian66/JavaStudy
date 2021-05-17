package com.liu.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Test01 {
    public static void main(String[] args) {
        String pag="com.liu.reflect.User";
        User user=new User();
        try {
//            Class c=Class.forName(pag);
//            System.out.println(Modifier.toString(c.getModifiers()));
            User user1=new User(102,"用户111");
            User user2=new User(1,"用户12");
            Class c1=user1.getClass();
            Field f=c1.getDeclaredField("salary");
            f.setAccessible(true);
            Object o = f.get(user1);
            System.out.println(o);
            f.set(user1,user2);
            Object o1 = f.get(user1);
            System.out.println(o1);
//            user.getClass().newInstance();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
