package ooday03;
//接口和类是并列关系。都是引用数据类型
public class InterfaceDemo {
    public static void main(String[] args) {
        //Inter o = new Inter(){}编译错误接口不能被实例化
    }
}
interface Inter1{
    abstract void show();
    //void say(){} 抽象方法不能有方法体编译错误，带中括号{}的名为方法体
}
interface Inter2{
    void test();//void前面默认有默认abstract
}

interface Inter3 extends Inter2{//继承，接口无法接口接口，extends 换 implements 编译错误
    void death();
}
abstract class Aoo{
    abstract void say();
}

class InterImpl extends Aoo implements Inter1,Inter3{
    public void show(){}
    public void test(){}//接口3继承借口2而来的test也需要overriding（加public）
    public void death(){}
    void say(){

    }
}

