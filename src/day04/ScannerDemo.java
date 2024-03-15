package day04;
import java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args) throws InterruptedException{
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入年龄");
        int age = scan.nextInt();
        Thread.sleep(2000);
        System.out.println("年龄是"+age+"岁");
        Thread.sleep(2000);
        System.out.println("请输入存款金额");
        Double money = scan.nextDouble();
        Thread.sleep(2000);
        System.out.println("已存款"+money);


    }
}
