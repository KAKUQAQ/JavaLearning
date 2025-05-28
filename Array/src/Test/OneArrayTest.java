package Test;

public class OneArrayTest {
    public static void main(String[] args) {
//        声明数组
        double[] prices;
//        初始化
        prices = new double[]{20.32, 43.21, 43.22, 22.21};

        String[] foods = new String[4];

//        其他方式
        int arr[] = new int[4];
        int[] arr1 = {1, 2, 3, 4};

//        调用
        System.out.println(prices[0]);

//        赋值
        foods[0] = "Apple";
        foods[1] = "Bananas";
        foods[2] = "Orange";
        foods[3] = "Pearl";

//        长度
        System.out.println(foods.length);

//        遍历
        for (int i = 0; i < foods.length; i++) {
            System.out.println(foods[i]);
        }


    }
}
