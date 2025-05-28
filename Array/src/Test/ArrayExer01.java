package Test;

public class ArrayExer01 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * (99 - 10 + 1)) + 10;
            }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

        int avg = sum / arr.length;
        System.out.println(avg);
    }
}
