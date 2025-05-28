package Test02;

public class Person {
    String name;
    public int age;
    char gender;

    public void eat(String food) {
        System.out.println("吃/喝" + food);
    }
    public void sleep(int hour) {
        System.out.println("每天睡" + hour + "小时");
    }
    public void interests(String hobby) {
        System.out.println("爱好是" + hobby);
    }
}
