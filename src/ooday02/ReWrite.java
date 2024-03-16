package ooday02;

public class ReWrite {
    public static void main(String[] args) {
        Teacher zw =new Teacher("张伟",39,"桥洞",25050.0);
        zw.SayHi();//Teacher Rewrite
        Student zz = new Student("张子",3,"桥洞","JSD2304",05);
        zz.SayHi();//Student Rewrite
        Doctor zs = new Doctor("张三",39,"护士","太平间");
        zs.SayHi();//Person Rewrite



    }
}
