package ooday02;

public class Teacher extends Person{
    double salary;
    Teacher(){}
    Teacher(String name,int age,String address,double salary){
//        this.name = name;
//        this.age = age;
//        this.address = address;
        super(name,age,address);
        this.salary = salary;
    }
    void teach(){
        System.out.println(name+"正在讲课");
    }
    void SayHi(){
        System.out.println("大家好我是"+name+"我今年"+age+"岁了"+"我家住在"+address+"工资为"+salary);

    }
}
