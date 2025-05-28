package Test02;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();

        person1.name = "Tom";
        person1.age = 18;
        person1.gender = '男';

        System.out.println(person1.name + " " + person1.age + " " + person1.gender);

        person1.eat("牛奶");
        person1.sleep(9);
        person1.interests("Jerry");

//        再创建一个实例
        Person person2 = new Person();
        person2.name = "Jerry";
        person2.age = 18;
        person2.gender = '男';
        System.out.println(person2.name + " " + person2.age + " " + person2.gender);

        person2.eat("奶酪");
        person2.sleep(8);
        person2.interests("Tom");
    }
}
