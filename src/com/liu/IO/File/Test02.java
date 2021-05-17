package com.liu.IO.File;

import java.io.File;
import java.util.Arrays;

public class Test02 {
    public static void main(String[] args) {
        File file=new File("src");
//        System.out.println(file.mkdirs());
//        for (String s : file.list()) {
//            System.out.println(s);
//        }
        print(file,0);

    }

    public static void print(File file,int deep){
        for (int i=0;i<deep;i++){
            System.out.print("-");
        }
        System.out.println(file.getName());
        if (file ==null || !file.exists()){
            return;
        }else if (file.isDirectory()){
            for (File listFile : file.listFiles()) {
                print(listFile,deep+1);
            }
        }
    }
}
