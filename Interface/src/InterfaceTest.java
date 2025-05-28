public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MIN_SPEED);
        System.out.println(Flyable.MAX_SPEED);

        Bullet b1 = new Bullet();
        b1.attack();
        b1.fly();
    }
}
interface Flyable {
    public static final int MIN_SPEED = 0;

    public static final int MAX_SPEED = 7900;

    //方法
    public abstract void fly();
}

interface Attackable{

    public abstract void attack();
}

abstract class Planet implements Flyable{

}
class Bullet implements Flyable, Attackable{
    @Override
    public void fly() {
        System.out.println("让子弹飞");
    }

    @Override
    public void attack() {
        System.out.println("击穿护甲");
    }
}
// 测试接口的继承关系
interface AA {
    void method1();
}
interface BB {
    void method2();
}
interface CC extends AA, BB {

}
class DD implements CC {

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}