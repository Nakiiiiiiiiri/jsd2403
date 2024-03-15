package day03;
//连接
public class OperDemo5 {
    public static void main(String[] args) {
        int age = 999;
        String name = "大哥";
        String speak ="形不成行，意不在意，再形不成行，意不形不成行，意不在意形";
        System.out.println(name+"年龄是："+age+"岁"+speak);
        //任意类型的数据和字符串项链都会变成字符串
        System.out.println(11+45+14);
        System.out.println(11+45+14+"");
        System.out.println(11+45+""+14);
        System.out.println(11+""+45+14);//串会往后同化但不会影响前面的
    }
}
