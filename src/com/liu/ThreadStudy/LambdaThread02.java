package com.liu.ThreadStudy;

public class LambdaThread02 {

    public static void main(String[] args) {
        ILove love=new ILove() {
            @Override
            public void lambda(int a) {
                System.out.println("匿名内部类--->"+a);
            }
        };
        love.lambda(10);
        //省去接口名方法名
        love=(int a)->{
            System.out.println("lambda--->"+a);
        };
        love.lambda(9);
        //省去类型
        love=(a)->{
            System.out.println("lambda--->"+a);
        };
        love.lambda(8);
        //只有一个参数 省去括号
        love=a->{
            System.out.println("lambda--->"+a);
        };
        love.lambda(7);
        //只有一句语句 省去花括号
        love=a->System.out.println("lambda--->"+a);
        love.lambda(6);
    }

}


interface ILove{
    void lambda(int a);
}
