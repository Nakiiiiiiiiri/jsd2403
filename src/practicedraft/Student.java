package practicedraft;

public class Student {
    String name;
    int age;
    String className;
    int stuId;
    Student(){}
    Student(String name,int age,String className,int stuId){
        this.name = name;
        this.age = age;
        this.className = className;
        this.stuId = stuId;

    }
    void study(){
        System.out.println(name+"studying");
    }
    void SayHi(){
        System.out.println("大家好我是"+name+"我今年"+age+"岁"+"我的班级是"+className+"我的学号是"+stuId);};
    void playWith(String anotherName){
        System.out.println(name+"在和"+anotherName+"玩");}
}
