package com.liu.IO.Stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Os {
    public static void main(String[] args) throws Exception{
        File src=new File("dest.txt");
        OutputStream os=null;
        os=new FileOutputStream(src); //从头覆盖
//        os=new FileOutputStream(src,true);   追加模式
        String msg="change\n";
        byte[] datas = msg.getBytes();
        os.write(datas,0, datas.length);  // 写入最好指定写入长度
        os.flush();   // 写入完一定要刷新

        os.close();
    }
}
