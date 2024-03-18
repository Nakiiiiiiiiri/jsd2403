package ooday03.Zoo;

public class Duck extends Animal implements Swim {
    Duck(){}
    Duck(String name,int age,String color){
        super(name, age, color);
    }
    public void eat(){
        System.out.println(age+"岁的"+color+"色的"+name+"在吃瓜");
    }
    public void swim(){
        System.out.println(age+"岁的"+color+"色的"+name+"正在游泳");
    }
}
