package com.liu.IO.ReaderWriter;

import java.io.*;

public class FileUtils {
    public static void main(String[] args) {
        //文件到文件

        try {
            InputStream is = new FileInputStream("abd.txt");
            OutputStream os = new FileOutputStream("abd-copy.txt");
            copy(is, os);
        } catch (IOException e) {
            e.printStackTrace();
        }

        byte[] datas=null;
//        文件到字节数组
        try {
            InputStream is = new FileInputStream("考核计划.png");
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            copy(is, os);
            datas = os.toByteArray();
            System.out.println(datas.length);
        }catch (IOException e){
            e.printStackTrace();
        }

//        字节数组到文件
        try {
            InputStream is = new ByteArrayInputStream(datas);
            OutputStream os = new FileOutputStream("copy.png");
            copy(is, os);
        }catch (IOException e){
            e.printStackTrace();
        }


    }

    public static void copy(InputStream is,OutputStream os){

        byte[] flush=new byte[3];
        int len=-1;
            try {
                while (((len=is.read(flush))!=-1))
                    os.write(flush, 0, len);  // 写入最好指定写入长度
                os.flush();   // 写入完一定要刷新
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                close(is,os);
            }

    }
    public static void close(Closeable...closeables){
        for (Closeable closeable : closeables) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
