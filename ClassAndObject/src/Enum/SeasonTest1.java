package Enum;

public class SeasonTest1 {
    public static void main(String[] args) {

        System.out.println(Season1.SPRING);

        System.out.println(Season1.SPRING.name());

        Season1[] seasons = Season1.values();
        for (Season1 season : seasons) {
            System.out.println(season);
        }

        String objName = "WINTER";
        Season1 season1 = Season1.valueOf(objName);
        System.out.println(season1);

        System.out.println(Season1.AUTUMN.ordinal());

        Season1.SUMMER.show();
    }
}

interface info {
    void show();
}

enum Season1 implements info {
    SPRING("Spring", "Warm"),
    SUMMER("Summer", "Hot"),
    AUTUMN("Autumn", "cool"),
    WINTER("Winter", "cold");

    private final String seasonName;
    private final String seasonType;

    Season1(String seasonName, String seasonType) {
        this.seasonName = seasonName;
        this.seasonType = seasonType;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonType() {
        return seasonType;
    }

    @Override
    public String toString() {
        return "Season1{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonType='" + seasonType + '\'' +
                '}';
    }

    @Override
    public void show() {
        System.out.println(seasonName + " " + seasonType);
    }
}
