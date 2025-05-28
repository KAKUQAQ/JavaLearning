package exer01;

public class Person {

    private int age;

    public void setAge(int a) {
        if (a >= 0 && a <= 100) {
            age = a;
        } else {
            System.out.println("Invalid Age");
        }
    }

//    获取
    public int getAge() {
        return age;
    }
}
