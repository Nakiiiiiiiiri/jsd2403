package Day05;
import java.util.Arrays;
import java.util.Random;
public class ArraySort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];
        for(int i=0;i<=arr.length-1;i++){
            arr[i] = rand.nextInt(100);
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n升序");
        Arrays.sort(arr);//升序
        System.out.println();
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n降序");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
