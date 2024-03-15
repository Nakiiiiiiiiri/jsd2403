package day06;
//重载：方法名相，同参数列表不同，允许，编译器会根据方法的签名自动绑定
public class OverLoadingDemo {
    public static void main(String[] args) {
        say();
        say("张三");

    }
    public static void say(){
        System.out.println("无");
    }
    public static void say(String name){
        System.out.println("name");
    }
}
