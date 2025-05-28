package FieldAndMethod.Polymorphism.apply;

public class AnimalTest {

    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        test.adopt(new Dog());
        test.adopt(new Cat());
    }

    public void adopt(Animal animal) {
        animal.eat();
        animal.jump();
    }

}
class Animal {
    public void eat(){
        System.out.println("进食");
    }

    public void jump(){
        System.out.println("跳跃");
    }
}

class Dog extends Animal {
    public void eat(){
        System.out.println("狗吃屎");
    }
    public void jump(){
        System.out.println("狗急跳墙");
    }

    public void watchDoor(){
        System.out.println("看家");
    }
}
class Cat extends Animal {
    public void eat(){
        System.out.println("猫吃鱼");
    }
    public void jump(){
        System.out.println("跳跳");
    }

    public void catchMouse(){
        System.out.println("抓老鼠");
    }
}
