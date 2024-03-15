package day03;

public class IfElseDemo {
    public static void main(String[] args) {
        double total = 499;
        if(total>=500){
            total*=0.8;
            //System.out.println("最终价格为"+total);
        }else {
            total*=0.9;
            //System.out.println("最终价格为"+total);
        }
        System.out.println("最终价格为"+total);

        int score = 92;
        if(score>=0 && score <=100){
            System.out.println("合法成绩");
        }else{
            System.out.println("不合法成绩");
        }
    }
}
