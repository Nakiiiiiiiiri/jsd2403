package ooday04;

public class Dog extends Animal implements Swim {
    Dog(){}

    Dog(String name,int age,String color){
        super(name, age, color);
    }
    void lookhome(){
        System.out.println(age+"岁的"+color+"色的"+name+"狗在看家");
    }
    void eat(){
        System.out.println(age+"岁的"+color+"色的"+name+"狗在吃骨头");
    }
    public void swim(){
        System.out.println(age+"岁的"+color+"色的"+name+"狗正在游泳");
    }

}
