package ooday03.company;

public class Manage extends staff implements bookedit{
    Manage(){}
    Manage(String name,int age,int salary){
        super(name,age,salary);

    }
    void sigh_in(){}
    void sigh_out(){}
    public void complete(){
        System.out.println("完成了经理的工作");
    }

    @Override
    public void edit() {
        System.out.println("编辑了书");

    }
}
