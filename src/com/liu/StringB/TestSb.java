package com.liu.StringB;


//stringBuilder 可变字符序列

public class TestSb {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<26;i++){
            sb.append((char)('a'+i));
        }
        System.out.println(sb);
        sb.reverse();   //逆置
        System.out.println(sb);
        sb.setCharAt(3, '我');
        //insert方法返回值为StringBuilder 因此可以链式调用
        sb.insert(6,'是').insert(9,"鸣人").insert(13,"!");
        System.out.println(sb);

        sb.append(1);
        System.out.println(sb);


        long num1=System.currentTimeMillis();
        String str="";
        for (int i=0;i<5000;i++){
            str=str+i;
        }
        long num2=System.currentTimeMillis();
        System.out.println(str);
        System.out.println("所费时间"+(num2-num1));

        long num3=System.currentTimeMillis();
        StringBuilder sb1=new StringBuilder("");
        for (int i=0;i<5000;i++){
            sb1.append(i);
        }
        long num4=System.currentTimeMillis();
        System.out.println(sb1);
        System.out.println("所费时间"+(num4-num3));
    }
}
