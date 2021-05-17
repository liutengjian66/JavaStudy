package com.liu.IO.ReaderWriter;

import java.io.*;

/*
图片--->字节数组--->图片
 */
public class IOTest04 {
    public static void main(String[] args) throws Exception{
        byte[] datas= fileToByteArray("考核计划.png");
        System.out.println(datas.length);
        byteArrayToFile(datas,"new.png");
    }

    //图片到字节数组
    public static byte[] fileToByteArray(String filePath)throws Exception{
        //创建源
        File file=new File(filePath);
        byte[] dest=null;
        //选择流
        InputStream is=null;
        ByteArrayOutputStream baos=null;
        is=new FileInputStream(file);
        baos=new ByteArrayOutputStream();
        //操作
        byte[] flush=new byte[1024];
        int len=-1;
        while ((len=is.read(flush))!=-1){
            baos.write(flush,0,len);   //写出到字节数组
        }
        baos.flush();
        return baos.toByteArray();
    }
//    字节数组到图片
    public static void byteArrayToFile(byte[] datas,String path)throws Exception{

        //创建源
        File newFile=new File(path);

        //选择流
        OutputStream os=null;
        ByteArrayInputStream bais=null;
        os=new FileOutputStream(newFile);
        bais=new ByteArrayInputStream(datas); //写入字节数组

        //操作
        byte[] flush=new byte[1024];
        int len=-1;
        while ((len=bais.read(flush))!=-1){
            os.write(flush,0,len);   //写出到文件
        }
        os.flush();
    }
}
