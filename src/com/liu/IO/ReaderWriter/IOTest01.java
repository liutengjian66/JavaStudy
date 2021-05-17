package com.liu.IO.ReaderWriter;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class IOTest01 {
    public static void main(String[] args) throws Exception {
        File file=new File("abd.txt");
        Reader reader=null;
        reader=new FileReader(file);
        char[] flush=new char[1024];
        int len=-1;
        while ((len=reader.read(flush))!=-1){
            String msg=new String(flush,0,len);
            System.out.print(msg);
        }
        reader.close();


    }
}
