package ooday02.anmials;

public class AnimalExtendsTest {
    public static void main(String[] args) {
        Animal animal = new Animal("动物",999,"绿色");
        Chick kun = new Chick("坤坤",33,"黑白色");
        Dog gou = new Dog("部落特亨德尔",31,"棕色");
        Fish xia = new Fish("虾头男",23,"虾色");
        animal.eat();
        kun.eat();
        kun.drink();
        kun.layeggs();
        gou.eat();
        gou.drink();
        gou.lookhome();
        xia.eat();
        xia.drink();

    }
}
