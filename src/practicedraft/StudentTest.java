package practicedraft;

public class StudentTest {
    public static void main(String[] args) {
        Student zs = new Student("zhangsan",45,"JSD2403",01);
        zs.study();
        zs.SayHi();
        zs.playWith("wangmou");

        Student wm = new Student();
        wm.name = "wangmou";
        wm.age = 4;
        wm.className="JSD2403";
        wm.stuId=1;
        wm.study();
        wm.SayHi();
        wm.playWith("zhangsan");



    }
}
