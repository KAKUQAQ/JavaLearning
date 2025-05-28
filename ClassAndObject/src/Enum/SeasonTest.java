package Enum;

public class SeasonTest {
    public static void main(String[] args) {
        System.out.println(Season.SPRING);
        System.out.println(Season.SPRING.getSeasonName());
    }
}

class Season{

    private final String seasonName;
    private final String seasonType;

    private  Season(String seasonName, String seasonType){
        this.seasonName = seasonName;
        this.seasonType = seasonType;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonType() {
        return seasonType;
    }

    public static final Season SPRING = new Season("Spring", "Warm");
    public static final Season SUMMER = new Season("Summer", "Hot");
    public static final Season AUTUMN = new Season("Autumn", "cool");
    public static final Season WINTER = new Season("Winter", "cold");

    public String toString() {
        return seasonName + " " + seasonType;
    }
}

