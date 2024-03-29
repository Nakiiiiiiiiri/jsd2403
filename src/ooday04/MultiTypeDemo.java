package ooday04;

//多态
public class MultiTypeDemo {
    public static void main(String[] args) {
        /*
        //演示向上造型:
        Dog o1 = new Dog("小黑",2,"黑"); //狗是狗
        //o1.name/age/color/drink()/eat()/swim()/lookHome();
        Animal o2 = new Dog("小黑",2,"黑"); //狗是动物
        //o2.name/age/color/drink()/eat();
        Swim o3 = new Dog("小黑",2,"黑"); //狗会游泳
        //o3.swim();
         */

        /*
        //演示向上造型(多态)的第1点应用:
        Master master = new Master();
        Dog dog = new Dog("小黑",2,"黑");
        Chick chick = new Chick("小花",3,"花");
        Fish fish = new Fish("小金",1,"金");
        master.feed(dog); //在传参的同时，系统自动做了向上造型
        master.feed(chick);
        master.feed(fish);
         */

        //演示向上造型(多态)的第2点应用:
        //Animal o = new Animal(); //编译错误，抽象类不能被实例化
        Animal[] animals = new Animal[5]; //创建Animal数组对象
        animals[0] = new Dog("小黑",2,"黑"); //向上造型
        animals[1] = new Dog("小白",1,"白");
        animals[2] = new Fish("小金",1,"金");
        animals[3] = new Fish("小花",2,"花");
        animals[4] = new Chick("小灰",3,"灰");
        for(int i=0;i<animals.length;i++){ //遍历所有动物
            animals[i].drink(); //每个动物喝水
            animals[i].eat(); //每个动物吃饭
            if(animals[i] instanceof Dog){
                Dog dog = (Dog) animals[i];
                dog.lookhome();
            }
            if(animals[i] instanceof Chick){
                Chick chick = (Chick) animals[i];
                chick.layeggs();
            }
            if(animals[i] instanceof Swim){
                Swim swim = (Swim) animals[i];
                swim.swim();
            }
        }

       /* Animal o = new Dog();
        Dog a = (Dog) o;
        Swim b = (Swim) o;
        if(o instanceof Fish){
            Fish c = (Fish) o;
        }else{
            System.out.println("o不是Fish类型");
        }

        System.out.println(o instanceof Fish);*/

    }

}
