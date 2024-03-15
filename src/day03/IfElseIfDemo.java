package day03;

public class IfElseIfDemo {
    public static void main(String[] args) {
        double total = 199;
        if(total>=2000){
            total*=0.5;
        }else if(total>=1000){
            total*=0.7;
        }else if (total>=500){
            total*=0.8;
        }else {
            total*=0.9;
        }
        System.out.println("最终金额为:"+total+"$");

    }
}
