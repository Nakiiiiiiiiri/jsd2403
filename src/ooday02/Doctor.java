package ooday02;

public class Doctor extends Person{
//    public static void main(String[] args) {
//        Doctor dr = new Doctor();
//    }
    String title;
    Doctor(){}
    Doctor(String name,int age,String title,String address){
//        this.name = name;
//        this.age = age;
//        this.address = address;
        super(name,age,address);
        this.title = title;


    }
    void cut(){
        System.out.println(title+name+"找人开刀了");
    }
}
