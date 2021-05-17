package com.liu.IO.OtherStream;

import java.io.*;

public class PrintStreamTest01 {
    public static void main(String[] args) throws IOException {
        PrintStream ps=System.out;
        ps.println("打印流");
        ps.append("如何使用");

        ps=new PrintStream(new BufferedOutputStream(new FileOutputStream("print.txt")),true); //true 自动刷新
        ps.println("打印流");
        ps.append("如何使用");
        ps.close();

//        重定向输出端
        System.setOut(ps);
        System.out.println("又来");  //打印到了print.txt中
//        重定向回控制台
        System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(FileDescriptor.out)),true));
        System.out.println("恢复正常");
    }
}
