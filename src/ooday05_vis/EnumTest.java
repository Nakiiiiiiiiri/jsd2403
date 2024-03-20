package ooday05_vis;

public class EnumTest {
    public static void main(String[] args) {
        Seasons1 w = Seasons1.WINTER;
        System.out.println(w.getSeasonName()+ w.getSeasonDesc());
        Seasons1[] seasons= Seasons1.values();
        for(int i=0;i< seasons.length;i++){
            System.out.println(seasons[i]+seasons[i].getSeasonName()+seasons[i].getSeasonDesc());
        }

    }
}
