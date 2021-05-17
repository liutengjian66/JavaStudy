package com.liu.IO.Decorate;

import java.io.*;

public class DecorateTest01 {
    public static void main(String[] args) {
        try {
            InputStream is=new BufferedInputStream(new FileInputStream("abd.txt"));
            OutputStream os=new BufferedOutputStream(new FileOutputStream("aaa.txt"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
