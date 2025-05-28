package Test;

public class TwoArray {
    public static void main(String[] args) {
//        声明和初始化
//        静态
        int[][] arr2 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        String[][] arr3 = new String[3][3];
//        动态
        double[][] arr4 = new double[2][];

//        调用
//        内层
        System.out.println(arr2[0][0]);
        System.out.println(arr2[2][0]);
//        外层
        System.out.println(arr2[0]);

        arr3[0][0] = "Hello";
        System.out.println(arr3[0][0]);
//        长度
        System.out.println(arr2.length);
        System.out.println(arr2[0].length);

//        遍历
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                System.out.println(arr2[i][j]);
            }
            System.out.println();
        }
    }
}
