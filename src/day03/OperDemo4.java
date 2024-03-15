package day03;
//赋值
public class OperDemo4 {
    public static void main(String[] args) {
        //赋值运算符 = += -= *= /= %=
        int a=5;
        a += 10;//等效于a=(int)(a+10) 附带强制转换功能
        System.out.println(a);
        a -= 5;//same as before
        System.out.println(a);
        a *= 3;//same as before
        System.out.println(a);
        a /= 6;//same as before
        System.out.println(a);

        short b = 5;
        //b = b+5;报错 byte,short,char参与运算时，先一律转换为int
        b+=5;//相当于b=(short)(b+5)
        System.out.println(b);
    }
}
