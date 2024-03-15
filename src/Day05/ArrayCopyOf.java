package Day05;
//数组排序

import java.util.Arrays;
//主要用于扩容
//数组的长度在数组创捷后不可变，因为数组元素的内存空间是连续的
//扩容是指创建一个更大的新数组并将源数组的内容复制进去
public class ArrayCopyOf {
    public static void main(String[] args) {
        int[] a ={10,20,25,30,35};
        int[] b = new int[10];
        b= Arrays.copyOf(a, 4);
        for(int i = 0;i<=b.length-1;i++){
            System.out.print(b[i]+" ");
        }
        System.out.println();
        for(int i = 0;i<=a.length-1;i++){
            System.out.print(a[i]+" ");
        }
    }
}
