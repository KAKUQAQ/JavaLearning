package Block;

public class BlockTest {

    public static void main(String[] args) {
        System.out.println(Person.info);

        Person p1 = new Person();
        System.out.println(p1.age);
    }
}

class Person{
    String name;
    int age;

    static String info = "人";
    public Person() {

    }
    public void eat(){
        System.out.println("吃饭");
    }

    // 非静态代码块
    {
        System.out.println("非静态代码块1");
        age = 1;
    }

    // 静态代码块
    static {
        System.out.println("静态代码块1");
    }
}
