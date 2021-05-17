package com.liu.IO.Buffer;



import java.io.*;
import java.net.URL;


public class BufferTest03 {
    public static void main(String[] args) {
        try(BufferedReader br=new BufferedReader(new InputStreamReader(new URL("http://www.baidu.com").openStream(),"UTF-8"))){
            int temp=-1;
            while ((temp=br.read())!=-1){
                System.out.print((char)temp);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
