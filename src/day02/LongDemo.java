package day02;

public class LongDemo {
    public static void main(String[] args) {
        long a=1000000000*2*10L;//未超出正常输出
        long b=1000000000*3*10L;//第二步计算时未手动切换long
        long c=1000000000L*3*10;//提前手动切换long防止溢出
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
