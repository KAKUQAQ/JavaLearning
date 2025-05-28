package Final;

public class FinalTest {
    public static void main(String[] args) {
        E e = new E();
        System.out.println(e.MIN_SCORE);
        E e1 = new E(10);
    }
}
// final不能有子类
final class A{

}

class C{
    public  final void method(){

    }
}
class D extends C{

}
class E{

    // 成员变量
    final int MIN_SCORE = 0;
    final int MAX_SCORE;
    final int LEFT;
    {
        MAX_SCORE = 100;
    }

    public E() {
        LEFT = 2;
    }
    public E(int left) {
        LEFT = left;
    }

}
class F{
    final void method(){
        final int num;
        num = 10;
        System.out.println(num);
    }

    public void method(final int num){

        System.out.println(num);
    }
}
