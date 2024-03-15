package day04;
import java.util.Scanner;
public class Extral01 {
    public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
        Double num = scan.nextDouble();
        if(num>0){
            System.out.println("+");
        }else if (num<0){
            System.out.println("-");
        }else {
            System.out.println("0");
        }


    }
}
