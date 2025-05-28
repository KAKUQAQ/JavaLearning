package Static;

public class ChineseTest {

    public static void main(String[] args) {

        Chinese c1 = new Chinese();
        c1.name = "哈哈";
        c1.age = 18;
        c1.nation = "China";

        Chinese c2 = new Chinese();
        c2.name = "嘻嘻";
        c2.age = 17;

        System.out.println(c1.nation);
        System.out.println(c2.nation);
    }
}
class Chinese{
    String name;
    int age;
    static String nation;

    @Override
    public String toString() {
        return "Chinese{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
