package Enum;

public class SeasonTest2 {
    public static void main(String[] args) {

        Season2.AUTUMN.show();

        Season2[] values = Season2.values();
        for (Season2 value : values) {
            value.show();
        }
    }
}

interface info1 {
    void show();
}

enum Season2 implements info1 {
    SPRING("Spring", "Warm"){
        public void show() {
            System.out.println("Flower");
        }
    },
    SUMMER("Summer", "Hot"){
        public void show() {
            System.out.println("GreenSun");
        }
    },
    AUTUMN("Autumn", "cool"){
        public void show() {
            System.out.println("RedLeaf");
        }
    },
    WINTER("Winter", "cold"){
        public void show() {
            System.out.println("Snow");
        }
    };

    private final String seasonName;
    private final String seasonType;

    Season2(String seasonName, String seasonType) {
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
        return "Season2{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonType='" + seasonType + '\'' +
                '}';
    }

}

