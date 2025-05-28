package Inner;

public class OuterClassTest1 {

    // 局部内部类
    public void method1() {

        // 局部内部类
        class A{
            // 可以声明属性、方法
        }
    }

    // 开发场景
    public Comparable getInstance(){

        // 提供实现Comparable接口的实例
        // 方式1 提供接口实现类的匿名对象
//        class MyComparable implements Comparable{
//
//            @Override
//            public int compareTo(Object o) {
//                return 0;
//            }
//        }
//        return new MyComparable();

        // 方式2 提供接口的匿名实现类的匿名对象
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }
}
