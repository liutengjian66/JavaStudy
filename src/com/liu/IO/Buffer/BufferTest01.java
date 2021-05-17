package com.liu.IO.Buffer;

import java.io.*;

public class BufferTest01 {
    public static void main(String[] args) {
        File file=new File("abd.txt");
        BufferedReader reader=null;
        try {
            reader=new BufferedReader(new FileReader(file));
            String str=null;
            while ((str=reader.readLine())!=null){
                System.out.println(str);
                System.out.println(1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
