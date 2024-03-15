package day02;

public class DoubleDemo {
    public static void main(String[] args) {
        double a = 3.14;//默认为小数的直接量没有经过转换
        double b = 3.13;
        float c = 3.14F;//无法自动转换必须手动加Ff
        System.out.println(a-b);
        System.out.println(a);
        System.out.println(c);
        double e=3,f=2.9;
        System.out.println(e-f);

    }
}
