package ooday02;

public class SuperDemo {
    public static void main(String[] args) {
        Boo b =new Boo();
        b.做餐();
    }
}
class Aoo{
    Aoo(){
        System.out.println("超类构造方法");
    }
    void 做餐(){
        System.out.println("中餐");
    }
}
class Boo extends Aoo{
    Boo(){
        super();//默认
        System.out.println("派生类构造方法");
    }

    void 做餐() {
        super.做餐();
        System.out.println("西餐");
    }
}

class Coo{
    //Coo(){}
    Coo(int a){}
}
class Doo extends Coo{
/*默认
* Doo(){
        super();//自动补充访问了父类的无参变量，但是父类给了有参数，默认没有无参报错
    }*/
    Doo(){
        super(5);
    }
 }