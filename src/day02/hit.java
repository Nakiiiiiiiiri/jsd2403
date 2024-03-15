package day02;

public class hit {
    public static void main(String[] args) {
        //命名只能抱憾字母数字_$，不能以数字开头，不能用关键字
        // 不建议用中文,拼音
        int age;
        int soure,mySoure,myJavaSoure;//小驼峰命名法
        int Dog,MyDog,MyJavaDog;//大驼峰命名法
        int 鳄了玛 = 1;
        int 私の庭からさっさと出てきて,慌てないで;
        System.out.println(鳄了玛);
        /*int,long,(short,byte,float),double,char,boolean
          int占用4字节范围负2^31~正2^31-1（21e=-2147483648~2147483647）溢出后循环*/
        /*long -2^63~2^63-1 8个字节 默认为int不超过自动转换，超过int范围赋值时手动加L 运算时L放前面避免
          long e = 1000000000*3*10L 导致10e*3运算是int发生溢出 优化 long e = 1000000000L*10L*3   */
        //溢出不是错误，但需要避免
        /*double 双精度 占用8字节
         float浮点型，float需要加F,不常用，两者用于计算时都会出现误差*/
        /*boolean只占一个字节只能存储true和false */
        /*char 占用2字符,要放在单引号中，只能放一个 使用世界通用Unicode编码字符集中常用的子集
          'a'=97 'A'=65 '0'=48  */
        /*自动（隐式）转换：从小到大，强制转换：从大到小 boolean一般不转换
        类型转换时 大小排序byte<<short<<int==char<<long<<float<<double
        强制转换可能会发生溢出，丢失精度。自动转换不会*/
        /*byte 1个字节 -2^7~2^7-1*/
        /*byte,short,char参与运算时，先一律转换为int*/
    }
}
