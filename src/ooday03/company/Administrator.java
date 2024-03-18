package ooday03.company;

public class Administrator extends staff {
    Administrator(){}
    Administrator(String name,int age,int salary){
        super(name,age,salary);
    }
    void sigh_in(){}
    void sigh_out(){}
    public void complete(){
        System.out.println(name+"完成了班主任的工作");
    }


}
