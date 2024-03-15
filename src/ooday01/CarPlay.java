package ooday01;

public class CarPlay {
    public static void main(String[] args) {
        Car hd = new Car("honda","black",189000.0);
        Car byd = new Car();
        byd.brand = "byd";
        byd.color = "white";
        byd.price = 79800.0;
        hd.start();
        hd.run();
        hd.stop();
        byd.start();
        byd.run();
        byd.stop();





    }
}
