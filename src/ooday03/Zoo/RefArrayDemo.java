package ooday03.Zoo;
import java.util.Scanner;


public class RefArrayDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //声明Dog数组dogs，包含3个元素，每个元素都是Dog型，默认值为null
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog("小黑",2,"黑");
        dogs[1] = new Dog("小白",8,"白");
        dogs[2] = new Dog("小绿",6,"绿");
        System.out.println(dogs[0].name);
        dogs[1].age = 18;
        dogs[2].swim();


//        for(int i=3;i< dogs.length;i++){
//            System.out.println("请输入第"+(i+1)+"只小狗们的数据并用空格隔开，输入完后按回车");
//            dogs[i]=new Dog(scan.next(),scan.nextInt(),scan.next());
//        }
        for (int i=0;i<dogs.length;i++){
            //System.out.println(dogs[i].name+" "+dogs[i].age+" "+dogs[i].color);
            dogs[i].lookhome();
        }

        Chick[] chicken = new Chick[3];
        chicken[0] = new Chick("小黑",2,"黑");
        chicken[1] = new Chick("小白",8,"白");
        chicken[2] = new Chick("小绿",6,"绿");
        for(int i=0;i<chicken.length;i++){
            chicken[i].layeggs();
        }

        Fish[] fishes = new Fish[3];
        fishes[0] = new Fish("小黑",2,"黑");
        fishes[1] = new Fish("小白",8,"白");
        fishes[2] = new Fish("小绿",6,"绿");
        for(int i=0;i<fishes.length;i++){
            fishes[i].swim();
        }
    }
}
