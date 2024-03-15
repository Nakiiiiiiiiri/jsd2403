package Day05;
//嵌套多行多列用，外层控制行内层控制列
//嵌套越少越好
//break只能跳一层，if else不算循环
public class BreakDemo {
    public static void main(String[] args) {
        for(int i = 1;i<=9;i++){
            for(int j = 1;j<=i;j++){
//                if(i==3){
//                break;}
                System.out.print(i+"*"+j+"="+i*j+"\t");//\t:固定占8位,往四的整数倍向上对其

            }
            System.out.println();

        }
    }
}
