package day06;
import java.util.Scanner;
public class CalAvgPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入评委人数");
        int n = scan.nextInt();//输入评委人数
        double[] arr = Cal(n);//取出评分数组
        double result = Result(arr);
        System.out.println("结果"+result);

    }
    public static double[] Cal(int n){
        double[] arr = new double[n];
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.println("请输入第"+(i+1)+"位评委的分数");
            arr[i] = scan.nextDouble();
        }
        return arr;
    }
    public static double Result(double[] arr){
        double max = arr[0];
        double min = arr[0];
        double sum = 0;
        double avg = 0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
            sum+=arr[i];
        }
        avg = (sum-max-min)/(arr.length-2);
        return avg;
    }
}
