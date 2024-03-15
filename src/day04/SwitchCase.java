package day04;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        switch (num){//仅仅包括byte short int char(本质也是int)//byte short int char string 枚举
            case 1:
                System.out.println("存款");
                break;//跳出Switch
            case 2:
                System.out.println("取款");
                break;
            case 3:
                System.out.println("查询");
                break;
            default:
                System.out.println("抢劫");
                break;
        }

    }
}
