package ooday02;

public class Doctor extends Person{
    String title;
    Doctor(){}
    Doctor(String name,int age,String title,String address){
        this.name = name;
        this.age = age;
        this.title = title;
        this.address = address;
    }
    void cut(){
        System.out.println(title+name+"找人开刀了");
    }
}
