package com.liu.IO.ReaderWriter;

import java.io.*;

public class IOTest02 {
    public static void main(String[] args) throws Exception {
        File file=new File("abd.txt");
        Writer writer=null;
        writer=new FileWriter(file,true);
        String msg=" 又何必去改变 已错过的时间";
        //法一
        writer.write(msg);
        writer.flush();
        //法二
        String str="你用你的指尖 ";
        writer.write(str.toCharArray());
        //法三 可链式编程
        writer.append("阻止我").append("说再见").append(" ");
        writer.close();
    }
}
