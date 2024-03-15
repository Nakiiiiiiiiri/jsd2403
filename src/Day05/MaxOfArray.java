package Day05;
//求数组元素最大值，并将其存储到数组最后一个元素的下一个位置
import java.util.Arrays;
public class MaxOfArray {
    public static void main(String[] args) {
        int[] arr = new int[25];
        int max = arr[0];
        for (int i=0;i<= arr.length-1;i++){
            arr[i]=(int)(Math.random()*100+1);
            System.out.print(arr[i]+"\t");
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println(" ");
        System.out.println("最大值为"+max);

        arr = Arrays.copyOf(arr,arr.length+1);
        arr[arr.length-1]=max;
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+"\t");
        }



    }
}
