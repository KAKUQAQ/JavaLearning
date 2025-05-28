package Test;

public class ArrayExer03 {
    public static void main(String[] args) {
//        杨辉三角
//        初始化
        int[][] yanghui = new int[10][];
        for (int i = 0; i < yanghui.length; i++) {
            yanghui[i] = new int[i + 1];
//            赋值
            yanghui[i][0] = 1;
            yanghui[i][i] = 1;
            for (int j = 1; j < yanghui[i].length - 1; j++) {
                yanghui[i][i - 1] = yanghui[i - 1][j] + yanghui[i - 1][j - 1];
            }

        }



//        遍历
        for (int i = 0; i < yanghui.length; i++) {
            for (int j = 0; j < yanghui[i].length; j++) {
                System.out.println(yanghui[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
