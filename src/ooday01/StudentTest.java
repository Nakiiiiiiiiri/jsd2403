package ooday01;

public class StudentTest {
    public static void main(String[] args) {
        Student zs = new Student();
        zs.name = "张三";
        zs.age = 22;
        zs.classname = "JSD2308";
        zs.stuID = 1;

        zs.sayHi();
        zs.playwith("狗");

        Student ll = new Student();
        ll.name ="李林";
        ll.age = 18;
        ll.classname = "JSD2308";
        ll.stuID = 2;

        ll.sayHi();
        ll.playwith("狗");

        Student Konata = new Student();
        Konata.name = "Konata";

        Konata.sayHi();//String 默认值为null,int 为 0；
        Konata.playwith("Kagami");
    }
}
