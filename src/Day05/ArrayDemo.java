package Day05;
//定义，初始化，访问，遍历(迭代)，复制，排序
import java.util.Scanner;

//相同数据类型元素(数据)的集合
//一种引用数据类型(int等是基本数据类型)
//类型相同逻辑相关的数据存到数组中
//整数(char也是)默认值为零
//小数也是0
//boolean是false
//语法报错是编译错误，运行报错是XX异常
public class ArrayDemo {
    public static void main(String[] args) {

        boolean[] A1 = new boolean[30];
        boolean[]test = {true,true,true,true,false};
        double[] A3 = new double[30];
        int a = 5;
        //int[] b = 5;编译错误
//？？       int[]b={1,2,3,4,5};
//        System.out.println(b[3]);
        int[] array1 = new int[3];//1)0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,......0
        int[] array2 = {2, 5, 8};//2)
        //System.out.println(array2[3]);越界异常
        int[] array3 = new int[]{2, 5, 8};//3) 中括号必须为空
        System.out.println("数组长度为" + array1.length);
        array1[0] = (int) 2.2;
        //array1[3]=5; 语法没错编译不报错，但是运行时会出现异常ArrayIndex Out of Bounds Exception数组下标越界异常
        System.out.println(array1[array1.length - 1]);

        System.out.println("-----------------------------");
        //4)数组的遍历/迭代
        int arrs[]= new int[100];
        for(int i = 0;i<=arrs.length-1;i++){
            arrs[i]=(int)(Math.random()*100+1);
            System.out.println(arrs[i]);
        }








    }
}
