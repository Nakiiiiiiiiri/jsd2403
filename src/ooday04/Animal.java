package ooday04;



public abstract class Animal {
    String name;
    int age;
    String color;

    Animal() {
    }

    Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
//    void feed(){
//        System.out.println("主人正在喂"+age + "岁的" + color + "色的"+name);
//    }

    abstract void eat();

    void drink() {
        System.out.println(age + "岁的" + color + "色的" + name + "正在喝水");
    }
}


