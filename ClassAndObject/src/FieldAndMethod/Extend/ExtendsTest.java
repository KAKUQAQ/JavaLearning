package FieldAndMethod.Extend;

public class ExtendsTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Tom";
        p1.age = 18;
        p1.eat();

        Student s1 = new Student();
        s1.name = "Jerry";
        s1.age = 19;
        s1.eat();
    }
}
