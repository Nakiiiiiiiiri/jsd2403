package ooday01;

public class CarPlay {
    public static void main(String[] args) {
        Car ms = new Car();
        ms.brand = "三菱";
        ms.price = 298000.0;
        ms.color = "白色";


        Car byd = new Car("比亚迪",79800.0 ,"白色");
        Car hd = new Car("本田",13000.0 ,"黄色");
        byd.start();
        byd.run();
        byd.stop();
        hd.start();
        hd.run();
        hd.stop();
        ms.start();
        ms.run();
        ms.stop();

    }
}
