package ooday01;

public class Student {
    String name;
    String classname;
    int stuID;
    int age;
    // 构造方法(重构)
    Student(String name1,String classname1,int stuID1,int age1){
        this.name = name1;
        this.classname = classname1;
        this.stuID = stuID1;
        this.age = age1;
    }

    void sayHi(){
        System.out.println("大家好，我叫"+this.name+"我的学号是"+this.stuID+"我的班级是"+this.classname+"我今年"+this.age+"岁了");
    }
    void playwith(String another){
        System.out.println(this.name+"正在和"+another+"玩");
    }
}

