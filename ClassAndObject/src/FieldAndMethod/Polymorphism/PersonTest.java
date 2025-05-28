package FieldAndMethod.Polymorphism;

public class PersonTest {
    public static void main(String[] args) {

        Person p1 = new Person();
        Man m1 = new Man();

        Person p2 = new Man();
        Person p3 = new Woman();

        p2.eat();
        ((Man) p2).walk();
        p3.eat();
        ((Woman) p3).walk();
    }
}
