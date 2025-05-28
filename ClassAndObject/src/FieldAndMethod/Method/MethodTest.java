package FieldAndMethod.Method;

public class MethodTest {
    public static void main(String[] args) {

    }
}

class Person {
    String name;
    int age;
    char gender;

    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(int hours){
        System.out.println("睡眠" + hours + "小时");
    }

    public String interests(String hobby) {
        String info  = "我的爱好是" + hobby;
        System.out.println(info);
        return info;
    }

    public int getAge() {
        return age;
    }
}

