package Day05;

import java.util.Arrays;
import java.util.Random;

public class Basic01 {
    public static void main(String[] args) {
        int[]a = new int[10];
        int[]b = {1,2,3,4,};
        int[]c = new int[]{11,45,14};
        a[0]=5;
        Random rand = new Random();
        System.out.println("尝试访问");
        System.out.println(b[1]+" "+a[0]+" "+c[0]);
        System.out.println("------------------------");
        System.arraycopy(c,0,b,2,2);
        System.out.println("b复制后输出结果");

        for(int i=0;i<=b.length-1;i++){
            System.out.print(b[i]+"\t");
        }
        System.out.println();
        System.out.println("------------------");
        int max = a[0];
        for(int i =0;i<a.length-1;i++){
            a[i]= rand.nextInt(100);
            //System.out.print(a[i]+"\t");
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println("以下输出为求出最大值后放在最后一位的下一位");
        a = Arrays.copyOf(a,a.length+1);
        a[a.length-1]=max;
        for(int i = 0;i<=a.length-1;i++){
            System.out.print(a[i]+"\t");
        }
        System.out.println("以下为升序");
        Arrays.sort(a);
        for(int i =0;i<=a.length-1;i++){
            System.out.print(a[i]+"\t");
        }
        System.out.println();
        for(int i = a.length-1;i>=0;i--){
            System.out.print(a[i]+"\t");
        }







    }
}
