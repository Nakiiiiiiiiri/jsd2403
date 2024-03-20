package ooday05;

public class StaticDemo {
    public static void main(String[] args) {
        StaticVar o1 = new StaticVar();
        o1.show();
        StaticVar o2 = new StaticVar();
        o2.show();
        StaticVar o3 = new StaticVar();
        o3.show();
        //栈(地址名0xxxo) 堆（进出进出） 方法区(只存一份)
        //内存中 a为实例变量在 堆 中有3份a=0 各走三次a++
        //b为静态变量在 方法区 中始终只有一份 走了三次b++
        StaticBlock o7 = new StaticBlock();

        /*StaticMethod o4 = new StaticMethod();  不通过Static
              int sum = o4.test(1,2);
        System.out.println(sum);*/

        int sum = StaticMethod.test(1,2);
        System.out.println(sum);//类名.访问









    }
}
