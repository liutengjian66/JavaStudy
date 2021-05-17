package com.liu.MathRandom;

import java.util.Random;

public class Test01 {
    public static void main(String[] args) {
        System.out.println(Math.abs(-10));   //绝对值
        System.out.println(Math.ceil(10.2)); //向上取整  floor向下

        System.out.println(Math.random());
        //round 表示"四舍五入"，算法为Math.floor(x+0.5) 即将原来的数字加上 0.5 后再向下取整，所以 Math.round(11.5) 的结果为 12，Math.round(-11.5) 的结果为 -11。
        System.out.println(Math.round(3.2));
        System.out.println(Math.pow(5, 2));
        Random random=new Random();
        System.out.println(random.nextInt());
    }
}
