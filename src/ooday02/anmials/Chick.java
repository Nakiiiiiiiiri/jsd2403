package ooday02.anmials;

import ooday02.anmials.Animal;

public class Chick extends Animal {
    Chick(){}
    Chick(String name,int age,String color){
        super(name, age, color);
    }
    void layeggs(){
        System.out.println(name+"哭哭下蛋");
    }
    void eat(){
        System.out.println(name+"在吃谷子");
    }
}
