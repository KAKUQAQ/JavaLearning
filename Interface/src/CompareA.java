public interface CompareA {

    public static void method1() {
        System.out.println("CompareA: 北京");
    }

    public default void method2() {
        System.out.println("CompareA: 上海");
    }

    default void method3() {
        System.out.println("CompareA: 广州");
    }

    default void method4() {
        System.out.println("CompareA: 深圳");
    }

    private void method5() {
        System.out.println("私有方法");
    }
}
