package day02;

public class VarDemo {
    public static void main(String[] args) {
        int x=1,y,z;//声明了三个整形变量名为x,y,z;x初始化1
        y=10;//给f赋值1
        //下划线仅代表提示，波浪线编译错误
        System.out.println(x);
        System.out.println(x*x);
        System.out.println(x*4);
        x=2;
        System.out.println(x);
        System.out.println(x*x);
        System.out.println(x*4);

        System.out.println(y);
        System.out.println(y*y);
        System.out.println(y*4);
        System.out.println("y*4");//不加引号变量值，加引号原样

        //不声明不赋值不能用

        int f =100;

        f=f+1000;
        System.out.println(f);
    }
}
