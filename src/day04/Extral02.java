package day04;

public class Extral02 {
    public static void main(String[] args) {


        for(int year = 1900,count =0 ;year<=2023;year++){

            if((year%4==0&&year%100!=0)||year%400==0){
                System.out.print(year+" ");
                if(++count%10==0){
                    System.out.println(" ");
                }
            }


        }
    }
}
