package com.liu.IO.Buffer;

import java.io.*;

public class BufferTest02 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
        String str = "";
        while (!str.equals("exit")){
            str = br.readLine();
            bw.write(str);
            bw.newLine();
            bw.flush();   //缓冲区未满，强制刷新，即可写出
        }
    }catch (IOException e){
            e.printStackTrace();
        }
    }
}
