package Test01;

public class PhoneTest {
    public static void main(String[] args) {

//        创建phone对象
        Phone p1 = new Phone();

//        通过Phone对象调用内部声明的属性和方法
//        格式 "对象.属性"、"对象.方法"
        p1.brand = "huawei";
        p1.price = 6999;

//        调用
        p1.call();
        p1.sendMessage("有内鬼，终止交易");
        p1.playGame();
    }
}
