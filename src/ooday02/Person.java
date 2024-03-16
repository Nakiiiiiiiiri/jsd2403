package ooday02;

public class Person {
    String name;
    int age;
    String address;
    Person(){}
    Person(String name,int age,String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }
    void eat(){
        System.out.println(name+"正在吃饭");
    }
    void sleep(){
        System.out.println(name+"正在睡觉");
    }
    void SayHi(){
        System.out.println("大家好我是"+name+"我今年"+age+"岁了"+"我家住在"+address);
    }
}
