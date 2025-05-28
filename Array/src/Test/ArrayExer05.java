package Test;

public class ArrayExer05 {
    public static void main(String[] args) {
//        反转
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
//        方式1
//        for (int i = 0; i < arr.length / 2; i++) {
//            int temp = arr[i];
//            arr[i] = arr[arr.length - 1 - i];
//            arr[arr.length - 1 - i] = temp;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

//        方式2【不推荐】
//        int[] newArr = new int[arr.length];
//        for (int i = 0; i < arr.length - 1; i++) {
//            newArr[arr.length - 1 - i] = arr[i];
//        }
//        arr = newArr;
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

//        方式3
        for(int i = 0, j = arr.length - 1;i < j; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for(int i = 0;i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
