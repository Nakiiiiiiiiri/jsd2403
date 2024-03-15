package day06;
import java.util.Scanner;
import java.util.Random;
public class Guessing {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int a = rand.nextInt(100);
        System.out.println(a);
        while (true){
            int b = scan.nextInt();
            if(b>a){
                System.out.println("大了");
            }else if(b<a){
                System.out.println("小了");
            }else {
                System.out.println("对了");
                break;
            }
        }


    }
}
