package ooday05;
///静态方法
public class StaticMethod {
    int a;//实例（对象来访问
    static int b;//静态 类名来访问
    void show(){
        System.out.println(/*this.*/a);//隐藏式this
        //System.out.println(/*StaticMethod.*/b);
    }
    static int test(int num1,int num2){
        //System.out.println(this.a); 静态方法中没有隐藏式this传递
        //没有this意味没有对象，实例a必须通过对象来访问，所以以上语句编译错误
        System.out.println(StaticMethod.b);
        int num = num1+num2;
        return num;
    }

}
