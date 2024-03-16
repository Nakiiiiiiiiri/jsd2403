package ooday02;

public class Person {
    public static void main(String[] args) {
        Teacher zw =new Teacher("张伟",39,"桥洞",25050.0);
        zw.SayHi();
        zw.teach();
        Doctor zs = new Doctor("张三",39,"护士","太平间");
        zs.SayHi();
        zs.cut();
        Student zz = new Student("张子",3,"桥洞","JSD2304",05);
        zz.SayHi();
        zz.study();
    }
    String name;
    int age;
    String address;
    Person(){
        //System.out.println("Person超类");
    }
    Person(String name,int age,String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }

    void Eat(){
        System.out.println(name+"正在吃饭");
    }
    void Sleep(){
        System.out.println(name+"正在睡觉");
    }
    void SayHi(){
        System.out.println("大家好我是"+name+"我今年"+age+"岁了"+"我家住在"+address);
    }
}
