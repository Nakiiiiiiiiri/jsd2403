package ooday01;

public class Car {
    String brand;
    Double price;
    String color;
    Car(){ }
    Car(String brand,Double price,String color){
        this.brand = brand;
        this.price = price;
        this.color = color;
    }
    void start(){
        System.out.println(brand+"牌子的"+color+"色的"+price+"块钱的车启动了");
    }
    void run(){
        System.out.println(brand+"牌子的"+color+"色的"+price+"块钱的车跑了");
    }
    void stop(){
        System.out.println(brand+"牌子的"+color+"色的"+price+"块钱的车停止了");
    }

    }


