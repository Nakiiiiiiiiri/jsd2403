package ooday05.Enum;

public class EnumTest {
    public static void main(String[] args) {
        Seasons[] seasons = Seasons.values();
        for(int i =0;i<seasons.length;i++){
            System.out.println(seasons[i]);
        }

        Seasons s = Seasons.SPRING;
        //Seasons o1 = Seasons.WINTER;
        switch (s){
            case AUTUMN:
                System.out.println("秋天到了");
                break;
            case SPRING:
                System.out.println("春天到了");
                break;
            case SUMMER:
                System.out.println("夏天到了");
                break;
            case WINTER:
                System.out.println("冬天到了");
                break;
        }
    }


}
