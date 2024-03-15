package Day05;

public class ContinueDemo {
    public static void main(String[] args) {
        for (int i=1;i<=9;i++){
            if(i%3==0){
                continue;
            }
            System.out.println(i+"*9="+i*9);
        }
        for (int i=1;i<=9;i++){
            if(i%3!=0){
                System.out.println(i+"*9="+i*9);
            }

        }
    }
}
