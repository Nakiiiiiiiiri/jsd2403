package ooday02.anmials;

public class Animal {
    String name;
    int age;
    String color;
    Animal(){}
    Animal(String name,int age,String color){
        this.name=name;
        this.age=age;
        this.color=color;
    }
    void eat(){
        System.out.println(age+"岁的"+color+"色的"+name+"正在进食");
    }
    void drink(){
        System.out.println(age+"岁的"+color+"色的"+name+"正在喝水");
    }
}
