package ooday03;

public class Chick extends Animal {
    Chick(){}
    Chick(String name,int age,String color){
        super(name, age, color);
    }
    void layeggs(){
        System.out.println(age+"岁的"+color+"色的"+name+"哭哭下蛋");
    }
    void eat(){
        System.out.println(age+"岁的"+color+"色的"+name+"在吃谷子");
    }
}
