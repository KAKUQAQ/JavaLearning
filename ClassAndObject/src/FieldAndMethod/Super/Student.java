package FieldAndMethod.Super;

public class Student extends Person {
    String school;
    int id = 1234; //学号

    public void study(){
        System.out.println("学习");
    }

    public void eat(){
        System.out.println("多吃");
    }

    public void sleep(){
        System.out.println("多睡");
    }
    public void show(){
        eat();
        this.eat();
        super.eat();
    }

    public void show2(){
        System.out.println(id); //1234
        System.out.println(this.id);
        System.out.println(super.id);
    }
}
