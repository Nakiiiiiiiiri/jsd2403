package day06;

public class Extral01 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for(int i=0;i<a.length;i++){
            a[i]=(int)(Math.random()*100+1);
            System.out.print(a[i]+" ");
        }
        int max = Max(a);
        System.out.println();
        System.out.println(max);
    }
    public static int Max(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
