package ooday05;

public class Aoo {
    private int a;// 本类
    int b;// 本类 同包类
    protected int c; //本类 同包类 子类
    public int d;//所有类

    void show(){
        a=1;
        b=2;
        c=3;
        d=4;

    }
}

class Boo {
    Aoo a = new Aoo();//访问成员变量可以再方法中也可以在方法外
    //但是赋值计算等操作必须在方法中，类中只能做定义和访问
    void show(){
        //Aoo a = new Aoo();//不在main函数中，也可以访问成员变量
        //a.a = 2;//private仅仅本类
        a.b = 3;
        a.c = 4;
        a.d = 5;
    }
}


