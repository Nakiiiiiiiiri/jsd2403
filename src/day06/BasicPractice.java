package day06;

import java.util.Random;

public class BasicPractice {
    public static void main(String[] args) {
        say();
        say(1);
        say(1, 1.1);
        int sum = sum(1, 1);
        System.out.println(sum + "两个参数有返回值");
        int[] arr = generateArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static void say() {
        System.out.println("无参无返回值");
    }

    public static void say(int i) {
        System.out.println(i + "有一次参无返回值");
    }

    public static void say(int i, double j) {
        System.out.println(i + j + "有两个参数，无返回值");
    }

    public static int sum(int i, int j) {
        int sum = i + j;
        return sum;
    }

    public static int[] generateArray() {
        int[] arr = new int[10];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        return arr;
    }
}
