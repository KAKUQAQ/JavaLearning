package Test;

public class ArrayExer06 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

//        扩容1倍
        int[] newArr = new int[arr.length << 1];

        for(int i = 0;i < arr.length;i++){
            newArr[i] = arr[i];
        }
        newArr[arr.length] = 10;
        newArr[arr.length + 1] = 20;
        newArr[arr.length + 2] = 30;
        arr = newArr;
        for(int i = 0;i < arr.length; i++){
            System.out.println(arr[i]);
        }

//        缩容
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        int deleteIndex = 4;
//        方法1
//        for(int i = deleteIndex; i < arr2.length - 1; i++){
//            arr2[i] = arr2[i + 1];
//        }
//        arr2[arr2.length - 1] = 0;
//        for(int i = 0; i < arr2.length; i++){
//            System.out.println(arr2[i]);
//        }

//        方法2
        int[] newArr2 = new int[arr2.length - 1];
        for(int i = 0;i < deleteIndex;i++){
            newArr2[i] = arr2[i];
        }
        for (int i = deleteIndex; i < arr2.length - 1; i++){
            newArr2[i] = arr2[i + 1];
        }
        arr2 = newArr2;
        for(int i = 0;i < arr2.length; i++){
            System.out.println(arr2[i]);
        }


    }
}
