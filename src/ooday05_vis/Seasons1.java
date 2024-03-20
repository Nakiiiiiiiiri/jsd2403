package ooday05_vis;

public enum Seasons1 {//加入属性
    SPRING("春天","暖和"),
    SUMMER("夏天","热"),
    AUTUMN("秋天","凉爽"),
    WINTER("冬天","冷");
    private String seasonName;
    private String seasonDesc;
    /*默认private*/ Seasons1(String seasonName, String seasonDesc){
        this.seasonDesc = seasonDesc;
        this.seasonName = seasonName;

    }
    public String getSeasonName(){
        return seasonName;
    }
    public void setSeasonName(){
        return;
    }
    public String getSeasonDesc(){
        return seasonDesc;
    }
    public void setSeasonDesc(){
        return;
    }
}
