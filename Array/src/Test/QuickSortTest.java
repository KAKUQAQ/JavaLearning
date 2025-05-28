//package Test;
//
//
//import java.util.Collections;
//
//import static java.util.Collections.swap;
//
//public class QuickSortTest {
//    public static void main(String[] args) {
//        int[] data = {9, -16, 30, 23, -30, -49, 25, 21, 30};
//        System.out.println("排序前：");
//        for (int i = 0; i < data.length; i++) {
//            System.out.print(data[i] + " ");
//        }
//
//        quickSort(data);
//        System.out.println("排序后：");
//        for (int i = 0; i < data.length; i++) {
//            System.out.print(data[i] + " ");
//        }
//
//    }
//    public static void quickSort(int[] data) {
//        subSort(data, 0, data.length - 1);
//    }
//    private static void subSort(int[] data, int start, int end) {
//        if (start < end) {
//            int base = data[start];
//            int low = start;
//            int high = end + 1;
//            while (true) {
//                while (low < end && data[++ low] - base <= 0);
//                while (high > start && data[--high] - base >= 0);
//                if (low < high) {
//                    swap(data, low, high);
//                }else {
//                    break;
//                }
//            }
//            swap(data, start, high);
//
//            subSort(data, start, high - 1);
//            subSort(data, high + 1, end);
//        }
//    }
//}
