package com.liu.ThreadStudy;

public class LambdaThread {

    static class Like2 implements ILike{

        @Override
        public void lambda() {
            System.out.println("静态内部类");
        }
    }

    public static void main(String[] args) {
        ILike like=new Like1();
        like.lambda();

        like=new Like2();
        like.lambda();

        new ILike() {
            @Override
            public void lambda() {
                System.out.println("匿名内部类");
            }
        }.lambda();

        like=()->{
            System.out.println("Lambda最简");
        };
        like.lambda();


    }

}

class Like1 implements ILike{

    @Override
    public void lambda() {
        System.out.println("外部类");
    }
}

interface ILike{
    void lambda();
}
