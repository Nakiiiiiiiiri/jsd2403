package ooday03;

public class Fish extends Animal {
    Fish(){}
    Fish(String name,int age,String color){
        super(name, age, color);
    }
    void eat(){
        System.out.println(age+"岁的"+color+"色的"+name+"在吃饲料");
    }
}
