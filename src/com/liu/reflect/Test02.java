package com.liu.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test02 {
    public static void main(String[] args) {
        String path="com.liu.reflect.User";
        try {
            Class cla=Class.forName(path);

            //获得类名
            System.out.println(cla.getName());
            System.out.println(cla.getSimpleName());

            //获得公共属性
            Field[] fields = cla.getFields();
            System.out.println(Arrays.toString(fields));
            //获得所有属性
            Field[] declaredFields = cla.getDeclaredFields();
            System.out.println(Arrays.toString(declaredFields));
            //获得指定属性
            Field name = cla.getDeclaredField("name");
            System.out.println(name);
            //获得方法信息
            Method[] methods = cla.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println("方法"+method);
            }
            //获得指定方法 需加上参数类型(因为重载的存在 需要加上参数
            Method setId = cla.getDeclaredMethod("setId", int.class);
            System.out.println(setId);
            //获得构造器信息
            Constructor[] declaredConstructors = cla.getDeclaredConstructors();
            System.out.println("构造器"+Arrays.toString(declaredConstructors));
            //找到具体的构造器
            System.out.println(cla.getDeclaredConstructor(int.class, String.class));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
