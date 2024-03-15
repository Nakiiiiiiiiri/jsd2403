package day03;
//if中必须是boolean结果，if执行内容只有一行可以不加{},但是情况很少，建议加上
/* if单路
           if else双路
           if else if 多路*/
public class IfDemo {
    public static void main(String[] args) {
        int cost = 99;
        if(cost>34)
        {
            cost-=34;//写cost=cost-34,容易遇到转换错误，如果cost为byte，short等需要cost=（int）（cost-34）
            System.out.println("成功下了一只泥岩");
        }
        System.out.println("继续执行");
        double total = 509;
        if(total>499)
        {
            total*=0.8;//double向下兼容即使*int也能按照double算
            //total=total*8;也正确
            System.out.println(total);
        }


    }
}
