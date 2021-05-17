package com.liu.IO.ReaderWriter;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteArrayos {
    public static void main(String[] args) throws Exception{

        String str = "不能说的秘密";
        byte[] bytes = str.getBytes();
        ByteArrayOutputStream os=null;
        os=new ByteArrayOutputStream();
        os.write(bytes,0,bytes.length);
        os.flush();
        String msg=new String(os.toByteArray(), 0, bytes.length);
        System.out.println(msg);
        os.close();

    }
}
