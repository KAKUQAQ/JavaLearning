package Test;

public class BinarySearchTest {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};

        int target = 3;

        int head = 0;
        int tail = arr1.length - 1;

        boolean flag = false;
        while (head <= tail) {
            int mid = (head + tail) / 2;
            if (arr1[mid] == target) {
                System.out.println("位置为" + mid);
                flag = true;
                break;
            }else if (target > arr1[mid]) {
                head = mid + 1;
            }else{
                tail = mid - 1;
            }
        }
        if (!flag) {
            System.out.println("没有");
        }
    }
}
