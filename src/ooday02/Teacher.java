package ooday02;

public class Teacher extends Person{
    double salary;
    Teacher(){}
    Teacher(String name,int age,String address,double salary){
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
    }
    void teach(){
        System.out.println(name+"正在讲课");
    }
}
