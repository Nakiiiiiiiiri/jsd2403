package practicedraft;
import day04.SwitchCase;

import java.util.Scanner;
public class Ultral {
    public static void main(String[] args) {
//判断正负        Scanner scan = new Scanner(System.in);
//        Double num = scan.nextDouble();
//        if(num>0){
//            System.out.println("+");
//        }else if (num<0){
//            System.out.println("-");
//        }else {
//            System.out.println("0");
//        }

//输出闰年        for(int year = 1900;year<=2023;year++){
//            if((year%4==0&&year%100!=0)||year%400==0){
//                System.out.println(year);
//            }else{
//
//            }
//
//
//        }

        //1 3 5 7 8 10 12月31
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入年份和月份");
        int year = scan.nextInt();
        int month = scan.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(year+"年有"+month+"月"+31+"天");
                break;
            case 4:
            case 6:
            case 9:
                System.out.println(year+"年有"+month+"月"+30+"天");
                break;
            case 2:{
                if((year%4==0&&year%100!=0)||year%400==0){
                    System.out.println(year+"年有"+month+"月"+29+"天");
                }else {
                    System.out.println(year+"年有"+month+"月"+28+"天");
                }break;
            }

        }



    }
}
