package ooday05;

public class StaticBlock {
    static String classname;
    static{//static 修饰的语句为静态块，方法被调用时自动执行一次
        classname = "Jsd2403";
        System.out.println("静态块");//先输出
    }
    StaticBlock(){
        System.out.println("构造方法");//后输出
    }
}
