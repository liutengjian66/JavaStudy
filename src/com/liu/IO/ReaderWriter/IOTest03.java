package com.liu.IO.ReaderWriter;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class IOTest03 {
    public static void main(String[] args) throws Exception{
        File or=new File("dest.txt");
        FileInputStream fis=new FileInputStream(or);
        DataInputStream is=new DataInputStream(fis);
        System.out.println(is.readChar());
    }
}
