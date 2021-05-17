package com.liu.IO.Stream;

import java.io.*;

public class Copy {
    public static void main(String[] args) {
        File src=new File("kao.png");
        File dest=new File("考核计划.png");
    try( OutputStream os = new FileOutputStream(src);
         InputStream is = new FileInputStream(dest)) {

//        os=new FileOutputStream(src,true);   追加模式
        byte[] flush = new byte[3];
        int len = -1;
        while ((len = is.read(flush)) != -1) {
            os.write(flush, 0, len);  // 写入最好指定写入长度
        }
        os.flush();   // 写入完一定要刷新
    }catch (IOException e){
        e.printStackTrace();
    }

    }
}
