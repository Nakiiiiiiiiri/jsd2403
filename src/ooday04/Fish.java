package ooday04;

public class Fish extends Animal implements Swim {
    Fish(){}
    Fish(String name,int age,String color){
        super(name, age, color);
    }
    void eat(){
        System.out.println(age+"岁的"+color+"色的"+name+"鱼在吃饲料");
    }
    public void swim(){
        System.out.println(age+"岁的"+color+"色的"+name+"鱼正在游泳");
    }
}
