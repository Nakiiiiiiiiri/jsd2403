package day03;
//条件
public class OperDemo6 {
    public static void main(String[] args) {
        int num = 5;
        int flag = num>0?1:-1;//true取前者，false取后者
        System.out.println(flag);
        int a=5,b=7;
        int max = a>b?a:b;
        System.out.println(a+"与"+b+"中"+max+"更大");
    }
}
