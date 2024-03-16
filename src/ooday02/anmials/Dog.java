package ooday02.anmials;

import ooday02.anmials.Animal;

public class Dog extends Animal {
    Dog(){}
    Dog(String name,int age,String color){
        super(name, age, color);
    }
    void lookhome(){
        System.out.println(name+"在看家");
    }
    void eat(){
        System.out.println(name+"在吃骨头");
    }
}
