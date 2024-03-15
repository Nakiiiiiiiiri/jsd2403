package Day05;
import java.util.Random;
public class Extral04 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] a = new int[10];
        a[0]= rand.nextInt(100);
        int max=a[0];
        int min = a[0];

        for(int i =1;i<=a.length-1;i++){
            a[i]= rand.nextInt(100);
            System.out.print(a[i]+"\t");
            if(max<a[i]){
                max=a[i];
            }
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println();
        System.out.println("最大值是"+max+"最小值是"+min);
    }
}
