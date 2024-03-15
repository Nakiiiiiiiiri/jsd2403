package day06;
import java.util.Scanner;
public class CalAvg {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请先输入评委个数");
        int n = scan.nextByte();//输入评委个数
        double[] scores =inputData(n);//得到评委分数数组
        double avg = CalAvg(scores);//输入评委数组得到平均分
        System.out.println("平均分为"+avg);
        double endresult = Last(n,avg,scores);
        System.out.printf("最终得分为%.2f",endresult);
    }

    public static double[] inputData(int n){//录入评委个数和各个评委的评分
        double[] scores = new double[n];
        Scanner scan = new Scanner(System.in);
        for(int i = 0;i<=scores.length-1;i++){
            System.out.println("请输入第"+(i+1)+"位评委的评分");
            scores[i]= scan.nextDouble();
        }
        return scores;
    }
    public static double CalAvg(double[] scores){//平均分
        double sum = 0,avg = 0;
        for(int i = 0;i<=scores.length-1;i++){
            sum+=scores[i];
        }
        avg = sum/scores.length;
        return avg;
    }
    public static  double Last(int n,double avg,double[] scores){
        double max = scores[0];
        double min = scores[0];
        for(int i = 0;i<=scores.length-1;i++){
            if(max<scores[i]){
                max = scores[i];
            }
            if(min>scores[i]){
                min = scores[i];
            }
        }
        double endresult=(avg*n-(max+min))/(n-2);
        return endresult;
    }
}
