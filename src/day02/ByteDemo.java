package day02;

public class ByteDemo {
    public static void main(String[] args) {
        byte a1 = 5;
        byte a2 = 7;
        //byte b1 = a1+a2;  运算时被转换为int报错,从大到小需要强制转换
        //byte b2 = byte(a1)+byte(a2)；  无意义,本就是byte，转换完参与计算时还是int
        byte b3 = (byte)(a1+a2);
        System.out.println(b3);
    }
}
