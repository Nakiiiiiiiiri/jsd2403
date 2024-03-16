package ooday02;

public class Student extends Person{
    String classname;
    int stuid;
    Student(){}
    Student(String name,int age,String address,String classname,int stuid){
        this.name = name;
        this.age = age;
        this.address = address;
        this.classname = classname;
        this.stuid = stuid;
    }
    void study(){
        System.out.println(name+"正在学习");
    }
    void sayhi(){
        System.out.println("大家好我是"+name+",我今年"+age+"岁了,我是"+classname+"班级的，我的学号是:"+stuid+"，我家是"+address);
    }
}
