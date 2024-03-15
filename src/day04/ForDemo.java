package day04;
//若与数字有关写for
//第一要素与第三要素相同do while  //1)循环变量的初始化2)循环的条件3)循环变量的改变 ???
//不同 while
public class ForDemo {
    public static void main(String[] args) {

        for(int i=0;i<5;i++)//i仅仅在当前作用域生效
        {
            System.out.println("开摆3年，坐牢30年。坐牢3年，坐牢33年");
        }
        for(int i=0;i<5;i++)
        {
            System.out.println("开摆3年，坐牢30年。坐牢3年，坐牢33年");
        }
        for(int i=0;i<5;i++)
        {
            System.out.println("开摆3年，坐牢30年。坐牢3年，坐牢33年");
            System.out.println(i);
        }
        //System.out.println(i);超出作用域无法使用

    }
}
