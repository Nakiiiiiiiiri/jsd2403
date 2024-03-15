package day04;
//第一要素与第三要素相同do while  //1)循环变量的初始化2)循环的条件3)循环变量的改变 ???
//不同 while
public class WhileDemo {
    public static void main(String[] args) throws InterruptedException{
        int times = 1;
        int result;
        while(/*true*/times<10){
            result = times*9;
            System.out.print(times+"*9="+times*9+" ");
            //times++;
            times++;
            //Thread.sleep(500);
        }
        /*初始值1 true 进入循环输出 times+1
            times = 2 true 进入循环
             times = 3 true in
             times = 4 true in
             times = 5 true in
             times = 6 true in
             times = 6 true in
              times = 7 true in
             times = 8 true in
             times = 9 true in
             times = 10 false stop;
          */
    }
}
