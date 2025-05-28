package Test;

public class LinearSearchTest {
    public static void main(String[] args) {
        int[] arr1 = new int[]{34, 54, 3, 2, 65, 7, 34, 5, 76, 34, 67};

        int target = 5;

        // 线性查找
//        方式1
//        boolean found = true;
//        for (int i = 0; i < arr1.length; i++) {
//            if (target == arr1[i]) {
//                System.out.println("位置为" + i);
//                found = false;
//                break;
//            }
//        }
//        if (found) {
//            System.out.println("没有");
//        }

//        方式2
        int i = 0;
        for (i = 0; i < arr1.length; i++) {
            if (arr1[i] == target) {
                System.out.println("位置为" + i);
                break;
            }
        }
        if (i == arr1.length) {
            System.out.println("没有");
        }
    }
}