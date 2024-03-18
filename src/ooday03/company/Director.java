package ooday03.company;

public class Director extends staff implements problemsolve,stafftrain,bookedit{
    Director(){}
    Director(String name,int age,int salary){
        super(name,age,salary);
    }
    void sigh_in(){}
    void sigh_out(){}
    public void complete(){
        System.out.println("完成了总监的工作");
    };

    @Override
    public void solve() {
        System.out.println(name+"总监解决了问题");

    }

    @Override
    public void train() {
        System.out.println(name+"总监培训了员工");

    }

    @Override
    public void edit() {
        System.out.println(name+"总监编辑了书本");

    }
}
