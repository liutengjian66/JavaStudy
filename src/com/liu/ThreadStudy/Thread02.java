package com.liu.ThreadStudy;

public class Thread02 implements Runnable {
    @Override
    public void run() {
        for (int i=0;i<20;i++) System.out.println("coding....");
    }

    public static void main(String[] args) {
//        Thread02 t2=new Thread02();
//        Thread proxy=new Thread(t2);
//        proxy.start();
        new Thread(new Thread02()).start();

        for (int i=0;i<20;i++) System.out.println("music....");

    }
}
