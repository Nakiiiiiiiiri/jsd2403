package day04;
import java.util.Scanner;
public class GuessDoWhile {
    public static void main(String[] args) {
        int num = (int)(Math.random()*1000+1);
        Scanner scan = new Scanner(System.in);
        System.out.println(num);
        int guess;
        //do while 比起while至少运行一次，先运行后判断
        System.out.println("开猜");
        do{

            guess = scan.nextInt();
            if(guess>num){
                System.out.println("猜大了,请继续");
            }else{
                System.out.println("猜小了，请继续");
            }
        }while (guess!=num);
        System.out.println("猜对了");


    }
}
