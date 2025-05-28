package Test;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
//        1. boolean equals(int[] a, int[] b):比较两个数组是否相等
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean isEqual = Arrays.equals(arr1, arr2);
        System.out.println(isEqual);

//        2. String toString(int[] a):输出数组的元素信息
        System.out.println(Arrays.toString(arr1));

//        3. void fill(int[] a, int val):将指定值填充到数组中
        Arrays.fill(arr1, 10);
        System.out.println(Arrays.toString(arr1));

//        4. void sort(int[] a):使用快速排序算法
        int[] arr3 = new int[]{34, 54, 3, 2, 65, 7, 34, 5, 76, 34, 67};
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));

//        5. int binarySearch(int[] a, int key):二分查找
        int index = Arrays.binarySearch(arr3, 5);
        if (index >= 0) {
            System.out.println("位置为" + index + "\t");
        }else{
            System.out.println("没有");
        }
        System.out.println(index);
    }
}
