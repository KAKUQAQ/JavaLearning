package Singleton;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend g1 = GirlFriend.getInstance();
    }
}

// 懒汉式
class GirlFriend {

    // 类的私有化
    private GirlFriend(){

    }

    // 声明实例
    private static GirlFriend instance = null;

    // 通过getXxx()获取实例，如果未创建对象，在方法内部创建
    public static GirlFriend getInstance(){
        if(instance == null){
            instance = new GirlFriend();
        }
        return instance;
    }

}