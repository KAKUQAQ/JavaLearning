package Inner;

public class OuterClass2 {
    public static void main(String[] args) {
        SubA a = new SubA();
        a.method();

        // 举例1 提供接口匿名实现类的对象
        A a1 = new A(){
            public void method(){
                System.out.println("匿名实现类的重写方法");
            }
        };
        a1.method();

        // 举例2 提供接口匿名实现类的匿名对象
        new A(){
            public void method(){
                System.out.println("匿名实现类的重写方法");
            }
        }.method();

        // 举例3
        SubB b = new SubB();
        b.method1();

        // 举例4 提供了继承于抽象类的匿名子类的对象
        B b1 = new B(){
            public void method1(){
                System.out.println("继承于抽象类的子类调用的方法");
            }
        };
        b1.method1();

        // 举例5 提供了继承于抽象类的匿名子类的匿名对象
        new B(){
            public void method1(){
                System.out.println("继承于抽象类的子类调用的方法");
            }
        }.method1();

        // 举例6
        C c = new C();
        c.method2();

        // 举例7 提供了一个继承于C的匿名子类的对象
        C c1 = new C(){};
        c1.method2();
    }
}

interface A{
    public void method();
}

class SubA implements A{

    @Override
    public void method() {
        System.out.println("SubA");
    }
}

abstract class B{
    public abstract void method1();
}

class SubB extends B{

    @Override
    public void method1() {
        System.out.println("SubB");
    }
}

class C{
    public void method2(){
        System.out.println("C");
    }
}
