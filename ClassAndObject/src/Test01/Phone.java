package Test01;

public class Phone {
//    属性
    String brand;
    double price;
//    方法
    public void call(){
        System.out.println("打电话");
    }
    public void sendMessage(String message){
        System.out.println("发送信息" + message);
    }
    public void playGame(){
        System.out.println("玩游戏");
    }
}
