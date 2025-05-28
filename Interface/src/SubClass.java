public class SubClass extends SuperClass implements CompareA, CompareB {
    public void method2() {
        System.out.println("SubClass: 上海");
    }

    @Override
    public void method3() {
        System.out.println("SubClass: 广州");
    }

    public void method4() {
        System.out.println("SubClass: 深圳");
    }

    public void method() {

        // 如何在实现类中调用父类或接口中被重写的方法

        method4();

        super.method4();

        CompareA.super.method3();// 调用接口A中的默认方法
        CompareB.super.method3();// 调用接口B中的默认方法
    }
}
