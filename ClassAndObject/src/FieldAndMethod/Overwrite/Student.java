package FieldAndMethod.Overwrite;

public class Student extends Person {
    String school;

    public void study(){
        System.out.println("学习");
    }

    public void eat(){
        System.out.println("多吃");
    }
}
