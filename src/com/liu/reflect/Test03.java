package com.liu.reflect;

//通过反射API动态的操作：构造器 方法 属性


import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

public class Test03 {
    public static void main(String[] args) {
        String path="com.liu.reflect.User";
        try {
            Class cla=Class.forName(path);
            //通过反射API动态调用构造方法，构造对象
            User user = (User)cla.getConstructor(int.class,String.class).newInstance(1,"下排名");
            System.out.println(user.getName());
            //通过反射API调用普通方法
            Method setId = cla.getMethod("setId", int.class);
            setId.invoke(user,110);
            System.out.println(user.getId());

            //操作属性
            Field name = cla.getDeclaredField("name");
            name.setAccessible(true);  //该属性不需要做安全检查，可以直接访问
            name.set(user,"啥啥啥");
            System.out.println(user.getName());

            Method setAll = cla.getDeclaredMethod("setAll", List.class, Map.class, int.class);
            Type[] genericParameterTypes = setAll.getGenericParameterTypes(); //获得参数类型
            for (Type type : genericParameterTypes) {
                System.out.println("###"+type);
                if (type instanceof ParameterizedType){
                    Type[] genericTypes = ((ParameterizedType) type).getActualTypeArguments();//转成参数化类型 获得参数的实际类型
                    for (Type genericType : genericTypes) {
                        System.out.println(genericType);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
