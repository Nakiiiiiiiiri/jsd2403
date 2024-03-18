package ooday03.company;

public abstract class staff {
    String name;
    int age;
    int salary;
    staff(){}
    staff(String name,int age,int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    void sigh_in(){
        System.out.println("签到");
    }
    void sigh_out(){
        System.out.println("签退");
    }
    abstract void complete();


}
