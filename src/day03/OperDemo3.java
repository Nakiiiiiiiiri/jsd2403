package day03;
//逻辑运算 &&(和) ||(或)  !(非)
public class OperDemo3 {
    public static void main(String[] args) {
        int a=5,b=6,c=10,d=5;
        boolean A1=b>a && b>c;
        System.out.println(A1);
        int age=18;
        System.out.println("&&逻辑运算");
        boolean A2= age>=18 && age <= 35;//and
        System.out.println(A2);
        System.out.println(!A2);
        System.out.println("||逻辑运算");
        boolean A3= age <= 12|| age >= 60;//or
        System.out.println(A3);
        System.out.println("!逻辑运算");
        //System.out.println(!a+d==c);a为5 不可非，!只能在结果是true和false上或者直接在true和false上使用
        System.out.println(!(a+d==c));
        System.out.println(!false);

        //&&短路 由于&&见false则false，当第一个条件为false时第二个条件不执行
        System.out.println("以下是&&短路现象");
        boolean A4= a>b && d++>=b;
        System.out.println("A4判断为"+A4+"； d初值为5现在依旧为"+d);//d++未执行，++d同理

        System.out.println("以下是||短路现象");
        boolean A5= a<b || ++d>=b;
        System.out.println("A4判断为"+A5+"； d初值为5现在依旧为"+d);//d++未执行，d++同理



    }
}
