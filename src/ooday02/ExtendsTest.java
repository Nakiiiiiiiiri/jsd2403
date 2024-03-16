package ooday02;

public class ExtendsTest {
    public static void main(String[] args) {
        Person p = new Person("adamn",97,"intree");
        p.Sleep();
        Teacher zw =new Teacher("张伟",39,"桥洞",25050.0);
        zw.SayHi();
        zw.teach();
        Doctor zs = new Doctor("张三",39,"护士","太平间");
        zs.SayHi();
        zs.cut();
        Student zz = new Student("张子",3,"桥洞","JSD2304",05);
        zz.SayHi();
        zz.study();

    }
}
