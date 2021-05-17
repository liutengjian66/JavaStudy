package com.liu.ThreadStudy;

public class StaticProxy {
    public static void main(String[] args) {
        new WeddingCompany(new You()).happyMarry();
        new Thread(()-> System.out.println("一遍Coding")).start();
    }
}

interface Marry{
    void happyMarry();
}

//真实角色
class You implements Marry{

    @Override
    public void happyMarry() {
        System.out.println("you are going to be married");
    }
}

class WeddingCompany implements Marry{

    //真实角色
    private Marry target;

    public WeddingCompany(Marry target) {
        this.target = target;
    }

    @Override
    public void happyMarry() {
        ready();
        this.target.happyMarry();
        after();
    }
    private void ready(){
        System.out.println("布置洞房");
    }
    private void after(){
        System.out.println("闹完了");
    }
}