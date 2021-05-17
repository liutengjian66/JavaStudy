package com.liu.IO.OtherStream;

import java.io.*;

public class DataTest {
    public static void main(String[] args) throws IOException{

        //写出
        ByteArrayOutputStream baos=new ByteArrayOutputStream();
        DataOutputStream dos=new DataOutputStream(new BufferedOutputStream(baos));
        byte[] datas=null;

//        操作
        dos.writeUTF("打码辛酸泪");
        dos.writeBoolean(true);
        dos.writeDouble(8.88);
        dos.flush();  //写出记得刷新！！！

        datas=baos.toByteArray();
        System.out.println(datas.length); //可以查看占了多少字节
        //读取
        DataInputStream dis=new DataInputStream(new BufferedInputStream(new ByteArrayInputStream(datas)));

//        读取的顺序与写出顺序保持一致
        String chars=dis.readUTF();
        boolean flag = dis.readBoolean();
        double v = dis.readDouble();

        System.out.println(chars+"---"+flag+"---"+v);
    }
}
