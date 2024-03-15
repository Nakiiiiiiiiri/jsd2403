package day04;
import java.util.Scanner;
public class CommandSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请选择功能1.存款 2.取款 3.查询 4.退出");
        int num = scan.nextInt();
        switch (num){
            case 1:
                System.out.println("存款");
                break;
            case 2:
                System.out.println("取款");
                break;
            case 3:
                System.out.println("查询");
                break;
            case 4:
                System.out.println("退出");
                break;
            default:
                System.out.println("抢劫");

        }

    }
}
