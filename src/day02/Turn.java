package day02;

public class Turn {
    public static void main(String[] args) {
        long a1 = 5;//自动转换
        double a2 = 5;//自动转换
        System.out.println(a2);
        long a = 5;//隐式转换
        long b = 10000000000L;//没发生转换
        int c = (int)b;//强制转换发生溢出
        System.out.println(c);
        double d = 3.14;
        int e= (int)d;
        System.out.println(e);



        System.out.println(2);
        System.out.println(2+2);
        System.out.println("2"+"2");
        System.out.println("2+2");
        System.out.println('2');
        System.out.println('2'+2);
        System.out.println('2'+'2');
    }
}
