package ooday03.company;

public class Lecturer extends staff implements problemsolve,stafftrain,bookedit{
    Lecturer(){}
    Lecturer(String name,int age,int salary){
        super(name, age, salary);
    }
    void sigh_in(){}
    void sigh_out(){}
    public void complete(){
        System.out.println("完成了讲师的工作");
    }


    @Override
    public void solve() {
        System.out.println(name+"讲师解决了问题");

    }

    @Override
    public void train() {
        System.out.println(name+"讲师培训了员工");

    }

    @Override
    public void edit() {
        System.out.println(name+"讲师编辑了书本");

    }
}
