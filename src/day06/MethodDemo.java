package day06;

import java.util.Random;

//方法的演示
public class MethodDemo {

    public static void main(String[] args) {
        say();
        say("百鬼あやめ", 999);//实参 有具体的值,
        int a = sum(1145, 14);
        System.out.println();
        int[] c = generateArray(12, 100);
        for (int i = 0; i <= c.length - 1; i++) {
            System.out.print(c[i] + "\t");
        }
        System.out.println("\nover");
        System.out.println(11111);
        b();

    }

//    //无参无返回值
//    public static void say() {
//        System.out.println("大家好");
//    }
//
//    //有参无返回值
//    public static void sayHi(String name, int age) {
//        if (age < 60) {
//            return;//在某种特定条件下，提前结束方法
//        }
//        System.out.println("大家好我叫" + name + "、今年" + age + "岁了");
//    }

    //有参有返回值
    public static int sum(int num1, int num2) {
        int num = num1 + num2;
        System.out.println(num);
        return num;
    }

    //定义长度和范围整形数组
    public static int[] generateArray(int len, int max) {
        int[] a = new int[len];
        Random rand = new Random();
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = rand.nextInt(max);
        }
        return a;
    }
    //嵌套调用
    public static void a(){
        System.out.println(22222);
    }
    public static void b(){
        a();
        System.out.println(33333);
    }
    public static void say(){
        System.out.println("大家好");
    }
    public  static void say(String name,int age){
        System.out.println("大家好我叫"+name+"今年"+age+"了");
    }


}
