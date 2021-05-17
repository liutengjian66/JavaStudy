package com.liu.IO.File;

import java.io.File;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) throws Exception {
        String path="D:/project/java-study/src/考核计划.png";
        File file=new File(path);
        System.out.println(file.length());   //返回的是文件的长度 若是文件夹则为0
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getParent());
        System.out.println(file.isDirectory());
        System.out.println("------------------");
        File file2 = new File("io.txt");
        boolean flag = file2.createNewFile(); //不存在才创建，创建成功返回true 存在则创建失败返回false
        System.out.println(flag);
        System.out.println(file2.delete());
        File file3 = new File("D:\\project\\java-study\\ioooo");
        flag = file3.createNewFile();
        System.out.println("是文件夹吗"+file3.isDirectory());
        System.out.println(flag);
        System.out.println(file3.delete());

    }
}
