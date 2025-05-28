package Test;

public class BoobleSortTest {
    public static void main(String[] args) {
        int[] arr1 = {34, 54, 3, 2, 65, 7, 34, 5, 76, 34, 67};

//        遍历
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i] + "\t");
        }

//        冒泡排序
        for (int j = 0; j < arr1.length - 1; j++) {
            for (int i = 0; i < arr1.length - 1 - j; i++) {
                if (arr1[i] > arr1[i + 1]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[i + 1];
                    arr1[i + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i] + "\t");
        }

    }
}
