package com.liu.IO.ReaderWriter;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;

public class ByteArrayis {
    public static void main(String[] args) throws Exception{
        String str = "不能说的秘密";
        byte[] bytes = str.getBytes();
        InputStream is=null;
        is=new ByteArrayInputStream(bytes);
        byte[] flush=new byte[1024];
        int len=-1;
        while((len=is.read(flush))!=-1){
            String msg=new String(flush,0,len);
            System.out.print(msg);
        }
    }
}
