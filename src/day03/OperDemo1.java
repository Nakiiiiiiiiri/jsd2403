package day03;
//算术运算符 + _ * / % ++ __ 运算结果是boolean
public class OperDemo1 {
    public static void main(String[] args) throws InterruptedException {
        int a1=7/2;
        System.out.println(a1);
        //Thread.sleep(3000);
        int a2=7%2;
        System.out.println(a2);
        int a2_2=8%2;
        System.out.println(a2_2);//整除
        /*int a3=7%0;
        System.out.println(a3);数学运算异常，0不能作为被除数*/
        int a4=0%7;
        System.out.println(a4);

        //++ --
        int a=5,b=8,c,d;
        a++;
        ++b;
        System.out.println("a:"+a+"; b:"+b);
       //此处开始a初始值6，b初始值9
        c=a++;
        d=++b;
        System.out.println("a:"+a+"; b:"+b+"; c:"+c+"; d:"+d);
        /* ++和__单独使用效果仅为加一。a++ >> a+1,++a >> a+1
        混合使用时a++先调用a再加a，++a先加a在调用a
        --同理
        */
    }
}
