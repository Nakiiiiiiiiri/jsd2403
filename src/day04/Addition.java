package day04;

public class Addition {
    public static void main(String[] args) {
        int sum=0;
        for (int i=1;i<=100;i++){
            sum+=i;
        }
        System.out.println(sum);
        int i=1;
        for (;i<=100;i++){//int在外面封号依旧要写（ ; ; ）
            sum+=i;
        }

        System.out.println(sum);

    }

}
