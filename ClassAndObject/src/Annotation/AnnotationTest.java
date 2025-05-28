package Annotation;

import java.util.Date;

public class AnnotationTest {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);
    }

}

class Person {
    String name;
    int age;

    public void eat(){
        System.out.println("eat");
    }
}

class Student extends Person {

    @Override
    public void eat() {
        System.out.println("eat more");
    }
}
