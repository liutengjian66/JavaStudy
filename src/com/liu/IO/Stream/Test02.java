package com.liu.IO.Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;


public class Test02 {
    public static void main(String[] args) throws Exception {
//        分段读取
        File src=new File("abd.txt");
        if (!src.exists())src.createNewFile();

        InputStream is=new FileInputStream(src);
        byte[] flush = new byte[3];  //缓冲容器
        int len=-1;  //接收长度
        while ((len=is.read(flush))!=-1){
            String str=new String(flush,0,len);
            System.out.print(str);
    }}
}
