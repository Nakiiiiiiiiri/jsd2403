package ooday05;

public class StaticFinalDemo {
    public static void main(String[] args) {
        System.out.println(Loo.PI);
        //Loo.PI = 6;   常量不能被改变

    }

}
class Loo{
    public static final double PI = 3.1415;//常量(静态常量)
    //public static  final int num; 必须同时成名初始化
}
