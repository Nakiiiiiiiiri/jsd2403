package ooday04;
//匿名内部类,有独立class字节码，用于简化代码
interface Inter{}
//class Aoo implements Inter{}//如此，但是Aoo无名
public class AnonInnerClassDemo {
    public static void main(String[] args) {
        int num = 5;
        num =6;
        Inter o1 = new Inter(){};//创建了一个Inter的派生类，但是没有名字，为派生类创建了个对象o1 并向上造型为Inter类型
        Inter o2 = new Inter(){};//
//        Inter aoo = new Aoo();//如此，但是Aoo无名
        InterInter o3 = new InterInter() {
            @Override
            public void test() {
                System.out.println("testtest");
                //num=6; 匿名内部类中不能更改局部变量（main中也是），默认识别局部变量为final
                //System.out.println(num);  final后的赋值 也访问不到 对于此处来说相当于
                //final int num = 5;
                //        num =6;

            }
        };
        o3.test();


    }
}
interface InterInter{
    void test();
}



