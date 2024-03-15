package practicedraft;

public class test {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            // 内层循环控制被乘数
            for (int j = 1; j <= i; j++) {
                // 输出乘法表达式
                System.out.print(j + " * " + i + " = " + (i * j) + "\t");
            }
            // 输出换行
            System.out.println();
        }
    }
}
