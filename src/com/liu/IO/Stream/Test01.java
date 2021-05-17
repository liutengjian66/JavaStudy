package com.liu.IO.Stream;


import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Test01 {
    public static void main(String[] args) throws Exception {

        //创建源
        File src=new File("abd.txt");
        if (!src.exists())src.createNewFile();
        //选择流
        InputStream is=new FileInputStream(src);
        //字节数组方式
//        byte[] data1 = is.readAllBytes();
//        System.out.println(new String(data1));
        //循环读取
        int temp;
        //读取
        while ((temp=is.read())!=-1){
            System.out.print((char)temp);
        }
//        关闭资源
        is.close();
    }
}
