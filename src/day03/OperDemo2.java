package day03;
// > < >= <= == != 关系运算结果是boolean
public class OperDemo2 {
    public static void main(String[] args) {
        int a=5,b=6,c=10,d=5;
        boolean A1 = a==b;
        boolean A2 = a!=c;
        boolean A3 = a<b;
        char e = '9';System.out.println(e);
        System.out.println(A1);
        System.out.println(A2);
        System.out.println(A3);

        System.out.println("a+b<c输出判断结果为:"+(a+b<c));
        //System.out.println(++a>5);
        System.out.println(a++>5);//false 原值5自增后6，先调用后增加，这一步判断仍为false，但下一步开始a初始化+1=6
        System.out.println(a++>5);//true 导致此处初值为6，下一步开始初始值+1=7
        System.out.println(++a>7);//true ++a先增加后调用，导致在调用前a已经+1=8


    }
}
