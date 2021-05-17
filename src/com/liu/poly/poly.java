package com.liu.poly;

public class poly {
    public static void main(String[] args) {
        Animal dog=new Dog();
        Cat cat=new Cat();
        animalCry(cat);
        System.out.println(dog instanceof Dog);
    }

    static void animalCry(Animal a){
        a.shout();
    }

}

class Animal{

    public void shout(){
        System.out.println("动物叫");
    }
}

class Cat extends Animal{
    public void shout(){
        System.out.println("喵喵喵");
    }
}
class Dog extends Animal{
    public void shout(){
        System.out.println("汪汪汪");
    }
}