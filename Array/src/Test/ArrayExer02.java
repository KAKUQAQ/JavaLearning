package Test;

public class ArrayExer02 {
    public static void main(String[] args) {
        int[] score = {5, 4, 6, 8, 9, 0, 1, 2, 7, 3};

        int sum = 0;
        int max = score[0];
        int min = score[0];

        for (int i = 0; i < score.length; i++) {
            sum += score[i];
//            获取最高
            if (max < score[i]) {
                max = score[i];
            }
//            获取最低
            if (min > score[i]) {
                min = score[i];
            }
        }

        int avg = (sum - max - min) / (score.length - 2);
        System.out.println(avg);
    }
}
