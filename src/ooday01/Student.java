package ooday01;
//构造函数，构造器，构建器
public class Student {
    String name;//成员变量（整个类中生效
    String classname;
    int stuID;
    int age;
    Student(){

    }
    //不写构造会默认有个无参构造 Student(){}
    // 构造方法

    Student(String name,String classname,int stuID,int age){
        this.name = name;//this可以访问成员变量。------当成员变量域局变量同名时不能省略this
        this.classname = classname;//this.成员变量名 访问成员变量 this.方法名() 调用方法 this()调用构造方法
        this.stuID = stuID;
        this.age = age;
    }

    void sayHi(){
        System.out.println("大家好，我叫"+this.name+"我的学号是"+this.stuID+"我的班级是"+this.classname+"我今年"+this.age+"岁了");
        //此处可以省略this，因为构造方法中的name离开局部失效，此处只能读到成员变量
    }
    void playwith(String another){
        System.out.println(this.name+"正在和"+another+"玩");
    }
}

