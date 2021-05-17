package com.liu.IO.ReaderWriter;

import java.io.*;

public class Copy {
    public static void main(String[] args) throws Exception{

        //确定源
        File or=new File("abd.txt");
        File des=new File("abd-copy.txt");
        //选择流
        Reader reader=null;
        Writer writer=null;
        reader=new FileReader(or);
        writer=new FileWriter(des);
        //操作
        char[] flush=new char[1024];
        int len=-1;
        while ((len=reader.read(flush))!=-1){
            String msg=new String(flush,0,len);
            System.out.println(msg);
            writer.append(msg);
        }
        writer.flush();
        reader.close();
        writer.close();
    }
}
