package com.liu.ThreadStudy;

public class Web12306 implements Runnable {
    private int tikicts=100;
    @Override
    public void run() {
        while (tikicts>0){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"----->"+tikicts--);
        }
         }

    public static void main(String[] args) {
        Web12306 web12306=new Web12306();
        new Thread(web12306,"麻黄").start();
        new Thread(web12306,"码农").start();
        new Thread(web12306,"第三者").start();
    }
}
