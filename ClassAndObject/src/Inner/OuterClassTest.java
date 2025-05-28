package Inner;

public class OuterClassTest {
    public static void main(String[] args) {

        // 创建Person的静态成员内部类实例
        Person.Dog dog = new Person.Dog();
        dog.eat();

        // 创建Person的非静态成员内部类实例
        Person p1 = new Person();
        Person.Bird bird = p1.new Bird();
        bird.eat();
        bird.show("Jerry");
    }
}
class Person{

    String name = "Tom";
    int age = 18;

    // 静态成员内部类
    static class Dog{
        public void eat(){
            System.out.println("吃骨头");
        }
    }

    // 非静态成员内部类
    class Bird{
        String name = "Wudy";
        public void eat(){
            System.out.println("吃虫子");
        }
        public void show(String name){
            System.out.println(age);
            System.out.println(name);
            System.out.println(this.name);
            System.out.println(Person.this.name);
        }
        public void show1(){
            eat();
            Person.this.eat();
        }

    }

    public void eat(){
        System.out.println("吃饭");
    }

    public void method() {
        // 局部内部类
        class InnerClass1{

        }
    }
    public Person(){
        class InnerClass1 {

        }
    }
}
