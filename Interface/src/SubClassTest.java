public class SubClassTest {
    public static void main(String[] args) {

        // 接口中声明的静态方法只能被接口调用，不能使用其实现类进行调用
        CompareA.method1();

        // 接口中声明的默认方法，可以被实现类继承，在没有重写的情况下默认调用接口中声明的方法
        // 如果重写，则调用重写的方法
        SubClass s1 = new SubClass();
        s1.method2();

        // 类实现了两个接口，而两个接口定义了同名同参的默认方法，此时类必须重写
        s1.method3();

        // 实现类继承了父类并实现了接口，父类和接口中声明了同名同参的方法，默认情况下子类在没有重写的情况下调用父类方法(类优先原则)
        s1.method4();
    }
}
