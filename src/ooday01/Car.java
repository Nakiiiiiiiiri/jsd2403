package ooday01;

public class Car {
    String brand;
    String color;
    Double price;
    Car(){}

    Car(String brand,String color,Double price){
        this.brand = brand;
        this.color = color;
        this.price = price;
    }
    void start(){
        System.out.println(brand+"品牌"+color+"颜色"+price+"价格的车启动");

    }
    void run(){
        System.out.println(brand+"品牌"+color+"颜色"+price+"价格的车行驶");
    }
    void stop(){
        System.out.println(brand+"品牌"+color+"颜色"+price+"价格的车停止");
    }

}





