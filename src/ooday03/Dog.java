package ooday03;

public class Dog extends Animal implements Swim{
    Dog(){}
    Dog(String name,int age,String color){
        super(name, age, color);
    }
    void lookhome(){
        System.out.println(age+"岁的"+color+"色的"+name+"在看家");
    }
    void eat(){
        System.out.println(age+"岁的"+color+"色的"+name+"在吃骨头");
    }
    public void swim(){
        System.out.println(age+"岁的"+color+"色的"+name+"在看家"+"正在游泳");
    }
}
