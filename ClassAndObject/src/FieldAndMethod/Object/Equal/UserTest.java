package FieldAndMethod.Object.Equal;

import java.util.Objects;

public class UserTest {
    public static void main(String[] args) {
        User u1 = new User("Tom", 12);
        User u2 = new User("Tom", 12);

        System.out.println(u1.equals(u2));// false

        String str1 = new String("Tom");
        String str2 = new String("Tom");
        System.out.println(str1.equals(str2));// true
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
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

}


