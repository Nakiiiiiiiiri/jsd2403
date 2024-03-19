package ooday04;

public class Chick extends Animal {

    Chick(){}
    Chick(String name,int age,String color){
        super(name, age, color);
    }
    void layeggs(){
        System.out.println(age+"岁的"+color+"色的"+name+"鸡库库下蛋");
    }
    void eat(){
        System.out.println(age+"岁的"+color+"色的"+name+"鸡在吃谷子");
    }
}
