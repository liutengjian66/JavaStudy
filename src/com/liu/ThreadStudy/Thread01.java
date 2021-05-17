package com.liu.ThreadStudy;

public class Thread01 extends Thread {
    @Override
    public void run() {
        for (int i=0;i<20;i++) System.out.println("正在打码");
    }

    public static void main(String[] args) {
        Thread01 T1=new Thread01();
        T1.start();
        for (int i=0;i<20;i++) System.out.println("正在听歌");

    }
}
