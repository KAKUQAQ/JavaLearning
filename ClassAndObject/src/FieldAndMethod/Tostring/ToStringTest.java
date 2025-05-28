package FieldAndMethod.Tostring;

public class ToStringTest {

    public static void main(String[] args) {
        User u1 = new User("Tom", 12);
        System.out.println(u1.toString());
    }
}

class User{
    String name;
    int age;

    public User() {
    }
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
